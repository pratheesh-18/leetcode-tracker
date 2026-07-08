// Last updated: 7/8/2026, 3:33:20 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int sum=0;
        int org=n;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return org%sum==0?sum:-1;
        
    }
}