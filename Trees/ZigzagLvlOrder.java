// Given the root of a binary tree, return the zigzag level order 
// traversal of its nodes' values. (i.e., from left to right, then
// right to left for the next level and alternate between)

import java.util.ArrayList;
import java.util.List;



public class ZigzagLvlOrder {

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
    public void helpereven(ArrayList<Integer>ans,int currlvl,int lvl,Node root){
        if(root==null) return;
        if(currlvl==lvl) ans.add(root.val);

        helpereven(ans,currlvl+1,lvl,root.left);
        helpereven(ans,currlvl+1,lvl,root.right);
    }
    
     public void helperodd(ArrayList<Integer>ans,int currlvl,int lvl,Node root){
        if(root==null) return;
        if(currlvl==lvl) ans.add(root.val);

        helperodd(ans,currlvl+1,lvl,root.right);
        
        helperodd(ans,currlvl+1,lvl,root.left);
    }
    public  int levels(Node root){
        if(root==null) return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));
        
    } 
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null)return arr;
        int lvl = levels(root);

        for(int i=0;i<=lvl-1;i++){
            ArrayList<Integer> ans= new ArrayList<>();
            if(i%2==0) helpereven(ans,0,i , root);
            else helperodd(ans,0,i,root);
            arr.add(ans);

        }
    return arr;
        
    }

    public List<List<Integer>> zigzagLevelOrder(Node root) {
        return levelOrder(root);
        
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
        

       
    }

    
}
