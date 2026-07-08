// Last updated: 7/8/2026, 3:35:38 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] res = new int[n];
        
        int index = 0;
        
      
        for(int x : nums){
            if(x < pivot) res[index++] = x;
        }
        
       
        for(int x : nums){
            if(x == pivot) res[index++] = x;
        }
        
     
        for(int x : nums){
            if(x > pivot) res[index++] = x;
        }
        
        return res;
    }
}
