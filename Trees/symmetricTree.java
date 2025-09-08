// Given the root of a binary tree, check whether 
// it is a mirror of itself (i.e., symmetric around its center)

public class symmetricTree {
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

   public static boolean isSymmetric(Node root) {
        if(root==null) return false;
        invertTree(root.left);

        return isSameTree(root.right,root.left);
    }
    public static Node invertTree(Node root) {
        if(root==null) return  null;
        invertTree(root.left);
        invertTree(root.right);

        Node temp = root.right;
        root.right=root.left;
        root.left=temp;
        return root;
         }

    public static  boolean isSameTree(Node p, Node q) {
        if(p==null && q==null)return true;
        if(p==null || q==null) return false;
        if(p.val !=q.val) return false;

        return isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);
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
      
        boolean symmetric=isSymmetric(a);
        System.out.println(symmetric);
    }
    
}
