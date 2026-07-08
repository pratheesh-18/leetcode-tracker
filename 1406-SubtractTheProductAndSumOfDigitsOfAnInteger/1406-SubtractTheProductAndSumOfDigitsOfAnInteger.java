// Last updated: 7/8/2026, 3:37:29 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,prod=1;
        while(n!=0){
            sum+=n%10;
            prod*=n%10;
            n/=10;
        }
        return prod-sum;
        
    }
}