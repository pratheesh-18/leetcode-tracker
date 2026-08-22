// Last updated: 8/22/2026, 9:36:56 AM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int org = n;
4        int sum = 0;
5        int prod = 1;
6
7        while (n != 0) {
8            int last = n % 10;
9            sum += last;
10            prod *= last;
11            n /= 10;
12        }
13
14        return org%(sum+prod)==0?true:false;
15    }
16}