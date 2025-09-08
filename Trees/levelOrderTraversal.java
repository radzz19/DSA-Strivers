// Given the root of a binary tree, return the level order traversal of its nodes' values.
//  (i.e., from left to right, level by level).

// Approch : 
// step1: Arraylist datatype use krenge : list banainge integertype arr ki 
// step2: levels find krenge lvel method se 
// step3: new arraylist baninge for loop chalhnge level-1 tak helper fun mein passkrenge arraylist , curr levl, int lvl,root ko 
// step4: if currlvl==lvl arraylist add krdenge (easyy pizzy)

import java.util.ArrayList;
import java.util.List;


public class levelOrderTraversal {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int x){
            this.val=x;
            left=null;
            right=null;
        }
    }
    public static void helper(ArrayList<Integer> ans, int currlvl, int lvl, Node root){
        if(root == null) return;
        if(currlvl == lvl)ans.add(root.val);
 
        helper(ans, currlvl + 1, lvl, root.left);
        helper(ans, currlvl + 1, lvl, root.right);  
    }

    public static int levels(Node root){
        if(root==null)return 0;
        return 1+ Math.max(levels(root.right), levels(root.left));
    }
  public static List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> arr = new ArrayList<>();
    if(root==null)return arr;
    int lvl = levels(root);

    for(int i = 0; i<lvl; i++) {
        ArrayList <Integer> ans = new ArrayList<>();
        helper(ans,0,i,root);
        arr.add(ans);  
    }
    System.out.println(arr); 
    return arr;
}
    public static void main(String[] args) {
        Node a  = new Node(3);
        Node b  = new Node(9);
        Node c  = new Node(20);
        Node d  = new Node(15);
        Node e  = new Node(7);
        
        a.left = b; a.right =c;
        c.left = d ; c.right = e;
        b.left = null; b.right = null;
        levelOrder(a);

       
    }

    
}
