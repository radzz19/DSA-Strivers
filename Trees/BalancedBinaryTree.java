

public class BalancedBinaryTree {
    private static class Node{
        int val;
        Node left;
        Node right;
        Node(int x){
            this.val=x;
            left=null;
            right=null;
        }
    }

    public static int levels(Node root) {
        if(root==null)return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }

public static boolean isBalanced(Node root) {
    if(root==null) return true;
    int diff = Math.abs(levels(root.right)-levels(root.left));
    if(diff>1)return false;
    boolean lft = isBalanced(root.left);
    if(!lft)return false;
    boolean rgt=isBalanced(root.right);
    if(!rgt)return false;

    return true;
        
    }
    public static void main(String[] args) {
        Node a  = new Node(3);
        Node b  = new Node(9);
        Node c  = new Node(20);
        Node d  = new Node(15);
        Node e  = new Node(7);
     
       
        a.left = b; a.right =c;
        c.left = d ; c.right = e;
        b.left=null; b.right=null;
      
        boolean balance=isBalanced(a);
        System.out.println(balance);
    }
    
}
