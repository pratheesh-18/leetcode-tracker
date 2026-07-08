// Last updated: 7/8/2026, 3:40:16 PM
class Solution {
    public boolean isPerfectSquare(int num) {
       int l=0,r=num;
       while(l<=r){
         int mid=(l+r)/2;
         long sqr=(long)mid*mid;
         if(sqr==num) return true;
         else if(sqr>num) r=mid-1;
         else l=mid+1;
       } 
       return false;
        
        
    }
}