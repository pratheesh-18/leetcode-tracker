// Last updated: 7/8/2026, 3:34:43 PM
class Solution {
    public int passThePillow(int n, int time) {
        int turns=time/(n-1);
        int rem=time%(n-1);
        if(turns%2==0) return rem+1;
        else return n-rem;
        
    }
}