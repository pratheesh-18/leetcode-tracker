// Last updated: 7/8/2026, 3:34:46 PM
class Solution {
    public int alternateDigitSum(int n) {
        String str=String.valueOf(n);
        int sum=0;
        for(int i=0;i<str.length();i++){
            int d=str.charAt(i)-'0';
            if(i%2==0) sum+=d;
            else sum-=d;
        }
        return sum;
        
    }
}