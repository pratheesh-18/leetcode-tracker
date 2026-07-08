// Last updated: 7/8/2026, 3:43:21 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int st=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                nums[st]=nums[i];
                st++;
            }
        }
        return st;
        
    }
}