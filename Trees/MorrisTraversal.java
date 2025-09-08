/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class MorrisTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr=root; //start

        while(curr!=null){
            //case1 curr.left exsist karta h toh hum predessor find krenge
            if(curr.left!=null){
                TreeNode pred =curr.left;

                while(pred.right!=null && pred.right!=curr){
                    pred=pred.right;
                }

                // case 2 pred.right==null h matlab yaha hum temporary link karenge
                if(pred.right==null){
                    pred.right=curr;
                    curr=curr.left;
                }
                // case4 unlinking excat same pos par vapis lana h add karva ke 
                else{
                    pred.right=null;
                    ans.add(curr.val);
                    curr=curr.right;

                }

            }
            else{
                ans.add(curr.val);
                curr=curr.right;
            }
        }

        return ans;

        
    }
}