// Last updated: 7/8/2026, 3:36:47 PM
class Solution {
    public int numWaterBottles(int full, int Ex) {
        int drink=full;
        int empty=full;
        while(empty>=Ex){
            int quo=empty/Ex;
            drink+=quo;
            int rem=empty%Ex;
            empty=quo+rem;
        }
        return drink;
        
    }
}