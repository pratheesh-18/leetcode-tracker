// Last updated: 7/8/2026, 3:41:21 PM
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5){
            count+=(n/5);
            n/=5;
        }
        return count;
    }
}