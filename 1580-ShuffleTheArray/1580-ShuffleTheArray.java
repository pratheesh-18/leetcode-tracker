// Last updated: 7/8/2026, 3:36:55 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0,j=n;
        int[] arr=new int[nums.length];
        int index=0;
        while(i<n && j<nums.length){
            arr[index++]=nums[i];
            arr[index++]=nums[j];
            i++;
            j++;
            


        }
        return arr;
        
    }
}