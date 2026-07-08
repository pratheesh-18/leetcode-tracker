// Last updated: 7/8/2026, 3:36:15 PM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
    Arrays.sort(costs);
    int count=0;
    if(costs[0]>coins) return 0;
    for(int c:costs){
        if(c<=coins){
            coins-=c;
            count++;
            
            
        }
        
    }
    return count;
    }
}