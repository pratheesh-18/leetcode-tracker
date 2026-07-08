// Last updated: 7/8/2026, 3:34:09 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
         int xor = 0;

        for (int x : derived)
            xor ^= x;

        return xor == 0;
        
    }
}