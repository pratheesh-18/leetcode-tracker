// Last updated: 7/8/2026, 3:40:51 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if((n&(n-1))==0) return true;
        return false;
        
    }
}