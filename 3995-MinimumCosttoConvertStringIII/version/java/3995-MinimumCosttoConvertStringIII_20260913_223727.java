// Last updated: 9/13/2026, 10:37:27 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int sum = 0;
18    public int sumEvenGrandparent(TreeNode root) {
19        
20        dfs(root, null, null);
21        return sum;
22    }
23    
24    public void dfs(TreeNode root, TreeNode parent, TreeNode gparent) {
25        if (root == null) return;
26        
27        if (gparent != null && gparent.val % 2 == 0) {
28            sum += root.val;
29        }
30        
31        if (root.left != null) {
32            dfs(root.left, root, parent);
33        }
34        
35        if (root.right != null) {
36            dfs(root.right, root, parent);
37        }
38    }
39}