// Last updated: 7/8/2026, 3:35:29 PM
class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=0;
        int xor=start^goal;
        while(xor!=0){
            ans+=xor&1;
            xor=xor>>1;
        }
        return ans;
        
    }
}