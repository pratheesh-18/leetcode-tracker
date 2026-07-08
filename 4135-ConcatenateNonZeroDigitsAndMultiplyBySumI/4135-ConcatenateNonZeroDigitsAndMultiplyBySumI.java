// Last updated: 7/8/2026, 3:32:19 PM
class Solution {
    public long sumAndMultiply(int n) {
        long x=0,sum=0,i=1;
        while(n!=0){
            long l=n%10;
            sum+=l;
            if(l==0){
                n/=10;
                continue;
            } 
          
            x+=(l*i);
            i*=10;
            n/=10;
        }
        return x*sum;
        
    }
}