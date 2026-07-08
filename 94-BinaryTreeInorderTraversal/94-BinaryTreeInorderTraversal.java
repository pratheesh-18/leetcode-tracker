// Last updated: 7/8/2026, 3:42:21 PM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        iot(root,arr);
        return arr;
    }
    private void iot(TreeNode root,List<Integer> arr){
        if(root==null)return;
        iot(root.left,arr);
        arr.add(root.val);
        iot(root.right,arr);
    }    
    
}