// Last updated: 7/19/2026, 8:26:32 AM
1class Solution {
2    public boolean canReach(int[] start, int[] target) {
3        int startColor = (start[0] + start[1]) % 2;
4        int targetColor = (target[0] + target[1]) % 2;
5
6        return startColor == targetColor;
7        
8    }
9}