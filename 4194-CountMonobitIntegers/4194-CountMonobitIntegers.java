// Last updated: 7/8/2026, 3:32:08 PM
class Solution {
    public int countMonobit(int n) {
            return 32 - Integer.numberOfLeadingZeros(n + 1);
        
    }
}