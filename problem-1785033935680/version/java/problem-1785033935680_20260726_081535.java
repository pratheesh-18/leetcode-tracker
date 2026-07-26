// Last updated: 7/26/2026, 8:15:35 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3          if (s == 0) return 0;
4        if (s > 9 * n) return -1;
5        StringBuilder sb = new StringBuilder();
6        for (int i = 0; i < n; i++) {
7            int digit = Math.min(9, s);
8            sb.append(digit);
9            s -= digit;
10        }
11
12        return Integer.parseInt(sb.toString());
13        
14    }
15}