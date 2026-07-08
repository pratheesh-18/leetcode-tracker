// Last updated: 7/8/2026, 3:40:54 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        for(Map.Entry<Integer,Integer> en:map.entrySet()){
            if(en.getValue()>n/3) l.add(en.getKey());
        }
        return l;
        
    }
}