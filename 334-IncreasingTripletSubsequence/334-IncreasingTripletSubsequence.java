// Last updated: 7/8/2026, 3:40:28 PM
class Solution {
    public boolean increasingTriplet(int[] arr) {
       int first=Integer.MAX_VALUE;
       int sec=Integer.MAX_VALUE;
       for(int n:arr){
        if(n<=first) first=n;
        else if(n<=sec) sec=n;
        else return true;

       }
       return false;
        
    }
}