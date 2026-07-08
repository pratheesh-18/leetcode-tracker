// Last updated: 7/8/2026, 3:42:13 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> out=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null) q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            List<Integer> in=new ArrayList<>();
            int len=q.size();
            while(len-->0){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                if(flag==true) in.add(temp.val);
                 else in.add(0,temp.val);
                
            }
            flag=!flag; 
            out.add(in);

        }
        return out;
        
    }
}