// Last updated: 7/8/2026, 3:38:04 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int[] nums=new int[arr.length];
      
        
        for(int i=0;i<nums.length;i++){
            int max=-1;
            for(int j=i+1;j<nums.length;j++){
                if(arr[j]>max) max=arr[j];
                
            }
            nums[i]=max;
        }
       
        return nums;
        
    }
}