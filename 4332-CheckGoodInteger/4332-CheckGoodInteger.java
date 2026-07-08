// Last updated: 7/8/2026, 3:31:44 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digit=0;
        int square=0;
        while(n>0){
            int last=n%10;
            digit+=last;
            square+=last*last;
            n=n/10;
        }
        return square-digit>=50?true:false;
        
    }
}