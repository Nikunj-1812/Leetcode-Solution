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
class Solution {
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        maxPath(root);
        return maxsum;
    }
    
    public int maxPath(TreeNode root) {
        if(root == null) return 0;
        
        int lc = Math.max(0,maxPath(root.left));
        int rc = Math.max(0,maxPath(root.right));

        int currsum = root.val + lc + rc;
        maxsum = Math.max(maxsum,currsum);

        return root.val + (Math.max(lc,rc));
    }
}