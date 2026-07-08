// Last updated: 7/8/2026, 3:36:49 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int pairs=0;
        for(int i=0;i<nums.length;i++){
                pairs+=freq.getOrDefault(nums[i],0);
                freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
           
        }
       
        return pairs;
        
    }
}