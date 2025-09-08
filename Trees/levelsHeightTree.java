public class levelsHeightTree {
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

    public static int levels(Node root){
        if (root == null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));    
    }

    public static void main(String[] args) {
        Node a  = new Node(1);
        Node b  = new Node(41);
        Node c  = new Node(3);
        Node d  = new Node(2);
        Node e  = new Node(6);
        Node f  = new Node(10);
        Node g  = new Node(5);
        Node h  = new Node(20);
       
        a.left = b; a.right =c;
        b.left = d ; b.right = e;
        c.left = f ; c.right = g;
        d.left = null; d.right = null;
        e.left = null; e.right = h;
        h.left = null ; h.right = null;

        int lev=levels(a);
        System.out.println("level of binary tree: "+ lev);
    }
}
