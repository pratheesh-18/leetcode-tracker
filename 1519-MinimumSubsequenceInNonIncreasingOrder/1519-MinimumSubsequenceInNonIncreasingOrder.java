// Last updated: 7/8/2026, 3:37:07 PM
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int totSum = 0;
        for (int n : nums) {
            totSum += n;
        }

        int arrsum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            list.add(nums[i]);
            arrsum += nums[i];
            if (arrsum > (totSum - arrsum)) {
                return list;
            }
        }

        return list;
    }
}