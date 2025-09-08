import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Your Approach:

// Use level order traversal (BFS):

// At each level:

// Traverse all nodes in the current level.

// Calculate the sum of node values.

// Divide by the number of nodes on that level to get the average.

// Store the average in a result list.

public class avgLevelNodes {
     public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            this.val=x;
            left=null;
            right=null;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root==null) return res;

        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            int size= que.size();
            double sum=0;
        
        for(int i=0;i<size;i++){
            TreeNode Node = que.poll();
            sum+=Node.val;
            if(Node.left!=null) que.add(Node.left);
            if(Node.right!=null) que.add(Node.right);

        }

          double avg = sum / size;
            res.add(avg);

        }
        return res;
        
    }

       public static void main(String[] args) {
        avgLevelNodes solution = new avgLevelNodes();

        // Create a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Call the method and get averages
        List<Double> averages = solution.averageOfLevels(root);

        // Print the averages level by level
        System.out.println("Average of each level:");
        for (Double avg : averages) {
            System.out.println(avg);
        }
}
}
    

