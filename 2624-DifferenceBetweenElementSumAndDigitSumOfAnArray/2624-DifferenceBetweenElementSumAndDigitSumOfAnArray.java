// Last updated: 7/8/2026, 3:34:48 PM
class Solution {
    static int calcDigitsums(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitsum=0;
        for(int n:nums){
            sum+=n;
            digitsum+=calcDigitsums(n);
        }
        return (int)Math.abs(sum-digitsum);
        
    }
}