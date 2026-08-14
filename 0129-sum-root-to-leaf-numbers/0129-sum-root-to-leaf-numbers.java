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
    public int Sum(TreeNode node , int sum){
        if(node == null) return 0;
        sum = sum * 10 +node.val;
        if(node.left == null && node.right == null) return sum;
        int ans = Sum(node.left, sum) + Sum(node.right,sum);
        return ans;
    }

    public int sumNumbers(TreeNode root) {
        return Sum(root,0);
    }
}