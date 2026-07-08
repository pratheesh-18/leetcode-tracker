// Last updated: 7/8/2026, 3:40:07 PM
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
    public static int helper(TreeNode root){
        int sum=0;
        if(root==null) return 0;
        if(root.left!=null && root.left.left==null && root.left.right==null)  sum+=root.left.val;
        sum+=helper(root.left);
        sum+=helper(root.right);
        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) { 
        return helper(root);
        
    }
}