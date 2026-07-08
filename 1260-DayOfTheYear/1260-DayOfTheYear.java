// Last updated: 7/8/2026, 3:37:50 PM
class Solution {
    public int dayOfYear(String date) {
        String[] cal=date.split("-");
        int year=Integer.parseInt(cal[0]);
        int mon=Integer.parseInt(cal[1]);
        int d=Integer.parseInt(cal[2]);
        int tot=0;
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%400==0)||(year%4==0 && year%100!=0)){
                days[1]=29;
              
         }
         if(mon==1) return d;
         for(int i=0;i<mon-1;i++){
            tot+=days[i];

         }
         tot+=d;

        
        
      return tot;

        
    }
}