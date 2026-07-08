// Last updated: 7/8/2026, 3:36:17 PM
class Solution {
    static int signFunc(long n){
        if(n<0) return -1;
        else if(n>0) return 1;
        else return 0;
    }
    public int arraySign(int[] nums) {
        int neg=0;
        for(int n:nums){
            if(n==0) return 0;
            if(n<0) neg++;

        }
        return neg%2==0?1:-1;
        
    }
}