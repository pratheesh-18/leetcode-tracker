// Last updated: 7/8/2026, 3:34:58 PM
class Solution {
    static int sum(int s,int e){
        int sum=0;
        for(int i=s;i<=e;i++){
            sum+=i;
        }
        return sum;
    }
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            int ls=sum(1,i);
            int rs=sum(i,n);
            if(ls==rs){
                return i;
            }
        }
        return -1;
        
        
    }
}