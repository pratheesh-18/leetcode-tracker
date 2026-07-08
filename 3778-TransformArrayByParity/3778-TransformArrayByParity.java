// Last updated: 7/8/2026, 3:32:50 PM
class Solution {
    public int[] transformArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                    arr[i]=0;
            } 
            else{
                arr[i]=1;

            }
            
        }
        Arrays.sort(arr);

        return arr;
        
    }
}