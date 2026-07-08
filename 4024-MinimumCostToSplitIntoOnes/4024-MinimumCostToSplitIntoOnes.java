// Last updated: 7/8/2026, 3:32:28 PM
class Solution {
    public int minCost(int n) {
        int tot=0;
        while(n!=1){
            int a=1;
            int b=n-1;
            int cost=a*b;
            tot+=cost;
            n=cost;
            
        }
        return tot;
        
    }
}