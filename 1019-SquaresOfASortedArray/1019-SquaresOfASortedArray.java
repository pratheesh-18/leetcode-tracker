// Last updated: 7/8/2026, 3:38:30 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int ind=nums.length-1;
        int l=0,r=nums.length-1;
        while(l<=r){
            int lv=nums[l]*nums[l];
            int rv=nums[r]*nums[r];
            if(lv>rv){
                res[ind--]=lv;
                l++;
            }
            else{
               res[ind--]=rv;
               r--;
            }

        }
        return res;
        
    }
}