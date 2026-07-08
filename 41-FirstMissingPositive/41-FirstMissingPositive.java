// Last updated: 7/8/2026, 3:43:10 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing=1;
        for(int n:nums){
            if(n>0){
                if(n==missing) missing++;
            else if(n>missing) break;
            }
            

        }
        return missing;
        
    }
}