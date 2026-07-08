// Last updated: 7/8/2026, 3:42:17 PM
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
    public boolean isSymmetric(TreeNode root) {
        return isSubsymmetric(root.left,root.right);
        
    }
    private boolean isSubsymmetric(TreeNode p,TreeNode q){
        if(p==null || q==null) return (p==q);
        return (p.val==q.val)&& isSubsymmetric(p.left,q.right) && isSubsymmetric(p.right,q.left);
    }
}