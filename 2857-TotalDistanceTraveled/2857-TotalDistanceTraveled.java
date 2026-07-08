// Last updated: 7/8/2026, 3:33:59 PM
class Solution {
    public int distanceTraveled(int m, int a) {
        int total=0;
       while(m>=5){
            total+=50;
            m-=5;
            if(a>=1){
                m++;
                a--;
            }
        }
        return total+(m*10);
        
    }
}