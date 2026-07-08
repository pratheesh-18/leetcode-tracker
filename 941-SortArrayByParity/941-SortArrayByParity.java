// Last updated: 7/8/2026, 3:38:37 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int ind=0;
        for(int n1:nums){
            if(n1%2==0) arr[ind++]=n1;
        }
        for(int n2:nums){
            if(n2%2!=0) arr[ind++]=n2;
        }
        return arr;
        
    }
}