// Last updated: 7/8/2026, 3:42:08 PM
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
          List<List<Integer>> out=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root == null) return out;
        q.add(root);
        while(!q.isEmpty()){
            int len =q.size();
            List<Integer> in=new ArrayList<>();
            while(len-- > 0){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                in.add(temp.val);

            }
            out.add(0,in);
        }
        return out;

        
    }
}