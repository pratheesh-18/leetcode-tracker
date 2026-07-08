// Last updated: 7/8/2026, 3:41:17 PM
class Solution {
    public int reverseBits(int n) {
        int rev=0;
        for(int i=31;i>=1;i--){
            int lsb=n&1;
            rev+=lsb<<i;
            n=n>>1;

        }
        return rev;
        
    }
}