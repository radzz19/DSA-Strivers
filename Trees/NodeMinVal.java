

public class NodeMinVal {

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

    public static int minNode(Node root){
        if (root == null) return Integer.MAX_VALUE;
        int leftMax = minNode(root.left);
        int rightMax = minNode(root.right);
        return Math.min(root.val, Math.min(leftMax, rightMax));
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

        int mini=minNode(a);
        System.out.println("minimum node: "+ mini);

    }
    
}
