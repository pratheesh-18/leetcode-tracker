// Last updated: 7/8/2026, 3:41:25 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){

          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> en:map.entrySet()){
            if(en.getValue()>n/2) return en.getKey();
        }
        return 0;
        
    }
}