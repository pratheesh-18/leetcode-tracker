// Last updated: 7/8/2026, 3:36:51 PM
class Solution {
    public int countOdds(int low, int high) {
        int range=(high-low)+1;
        if(low%2!=0 && high%2!=0) return range/2+1;
        else return range/2;
        
    }
}