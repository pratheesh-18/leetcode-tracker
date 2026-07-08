// Last updated: 7/8/2026, 3:36:09 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i+nums.length]=nums[i];
        }
        return ans;
        
    }
}