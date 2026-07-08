// Last updated: 7/8/2026, 3:31:45 PM
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum=0;
        int i=1;
        while(i<=(n+k)){
            if(Math.abs(n-i)<=k && (n&i)==0) sum+=i;
            i++;
            
        }
        return sum;
        
    }
}