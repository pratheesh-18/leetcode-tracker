// Last updated: 7/8/2026, 3:38:36 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res=new int[nums.length];
        int i=0,j=1;
        for(int n:nums){
            if(n%2==0){
                res[i]=n;
                i+=2;
            }
            else{
                res[j]=n;
                j+=2;
            }

        }
        return res;
        
    }
}