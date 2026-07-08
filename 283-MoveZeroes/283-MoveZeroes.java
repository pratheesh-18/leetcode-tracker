// Last updated: 7/8/2026, 3:40:37 PM
class Solution {
    public void moveZeroes(int[] nums) {
       int pos = 0;

        for (int n : nums) {
            if (n != 0) nums[pos++] = n;
        }

        while (pos < nums.length) {
            nums[pos++] = 0;
        }

        
    }
}