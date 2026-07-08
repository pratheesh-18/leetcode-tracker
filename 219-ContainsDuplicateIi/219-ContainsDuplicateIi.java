// Last updated: 7/8/2026, 3:40:57 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],i);
            else if(Math.abs(map.get(nums[i])-i)<=k){
                 return true;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
        
    }
}

//arr k 
// if 2 unique index i and j and nums[i]==nums[j] and abs(i-j)<=k
//[1,2,3,1] k=3
