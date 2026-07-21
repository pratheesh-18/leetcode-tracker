// Last updated: 7/21/2026, 9:01:29 AM
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        int str = 0, end = s.length() - 1;
4        String vow = "aeiouAEIOU";
5        int lc = 0, rc = 0;
6
7        while (str < end) {
8            if (vow.contains(String.valueOf(s.charAt(str))))
9                lc++;
10
11            if (vow.contains(String.valueOf(s.charAt(end))))
12                rc++;
13
14            str++;
15            end--;
16        }
17
18        return lc == rc;
19    }
20}