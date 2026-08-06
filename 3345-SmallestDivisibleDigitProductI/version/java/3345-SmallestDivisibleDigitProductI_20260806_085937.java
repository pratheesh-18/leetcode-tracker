// Last updated: 8/6/2026, 8:59:37 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        int ans=0;
4        while(true){
5            int prod=1;
6            int org=n;
7            while(org!=0){
8                prod=prod*(org%10);
9                org/=10;
10            }
11            if(prod%t==0){
12                ans=n;
13                break;
14            }
15            n++;
16
17        }
18        return ans;
19        
20    }
21}