// Last updated: 7/8/2026, 3:35:02 PM
class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0,j=i+1;
        while(j<nums.length){
            if(nums[i]==nums[j]) {
                nums[i]*=2;
                nums[j]=0;
            }
            i++;
            j++;
        }
        int[] nums1=new int[nums.length];
        int pos = 0;

        for (int n : nums) {
            if (n != 0) nums1[pos++] = n;
        }
        while (pos < nums.length) {
            nums1[pos++] = 0;
        }

       return nums1;
        
    }
}