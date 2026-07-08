// Last updated: 7/8/2026, 3:33:06 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int count=0;
        while(x>=1 && y>=4){
            x--;
            y=y-4;
            count++;
        }
       
         return (count%2==1)?"Alice":"Bob";
        
    }
}