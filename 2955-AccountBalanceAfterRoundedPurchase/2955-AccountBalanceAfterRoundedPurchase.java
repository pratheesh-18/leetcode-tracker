// Last updated: 7/8/2026, 3:33:45 PM
class Solution {
    public int accountBalanceAfterPurchase(int pa) {
        int last=pa%10;
        if(last<=4){
            return 100-(pa/10)*10;
        }
        else return 100-((pa/10)+1)*10;
        
        
    }
}