// Last updated: 7/8/2026, 3:41:41 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        pot(root,arr);
        return arr;
    }
    private void pot(TreeNode root,List<Integer> res){
            if(root==null) return;
            pot(root.left,res);
            pot(root.right,res);
            res.add(root.val);

    }
}