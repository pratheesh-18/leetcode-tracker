// Last updated: 9/13/2026, 10:59:43 PM
1class Solution {
2    public int triangularSum(int[] nums) {
3        int n = nums.length;
4        
5        for (int size = n; size > 1; size--) {
6            for (int i = 0; i < size - 1; i++) {
7                nums[i] = (nums[i] + nums[i + 1]) % 10;
8            }
9        }
10
11        return nums[0];
12    }
13}