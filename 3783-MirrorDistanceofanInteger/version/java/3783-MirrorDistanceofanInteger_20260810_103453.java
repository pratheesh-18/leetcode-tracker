// Last updated: 8/10/2026, 10:34:53 AM
1class Solution {
2    public int mirrorDistance(int n) {
3        int org=n;
4        int rev=0;
5        while(n!=0){
6            rev=rev*10+n%10;
7            n/=10;
8        }
9        return Math.abs(org-rev);
10        
11    }
12}