// Last updated: 7/8/2026, 3:31:47 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            long sum = 0;

            for(int j = i; j < n; j++) {
                sum += nums[j];

                int last = (int)(sum % 10);

                long temp = sum;
                while(temp >= 10) {
                    temp /= 10;
                }

                int first = (int)temp;

                if(first == x && last == x) {
                    count++;
                }
            }
        }

        return count;
        
    }
}