// Last updated: 7/8/2026, 3:32:44 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int p1=(int)Math.abs(z-x);
        int p2=(int)Math.abs(z-y);
        if(p1>p2) return 2;
        else if(p2>p1) return 1;
        else return 0;

        
    }
}