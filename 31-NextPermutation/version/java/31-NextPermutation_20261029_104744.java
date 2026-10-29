// Last updated: 10/29/2026, 10:47:44 AM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length - 1;
4        while (i > 0 && nums[i-1] >= nums[i]) {
5            i--;
6        }
7        if (i == 0) {
8            reverse(nums, 0, nums.length-1);
9            return;
10        }
11        int j = nums.length - 1;
12        while (j >= i && nums[j] <= nums[i-1]) {
13            j--;
14        }
15        swap(nums, i-1, j);
16        reverse(nums, i, nums.length-1);
17    }
18
19    private void swap(int[] nums, int i, int j) {
20        int temp = nums[i];
21        nums[i] = nums[j];
22        nums[j] = temp;
23    }
24
25    private void reverse(int[] nums, int start, int end) {
26        while (start < end) {
27            int temp = nums[start];
28            nums[start] = nums[end];
29            nums[end] = temp;
30            start++;
31            end--;
32        }
33    }
34
35}