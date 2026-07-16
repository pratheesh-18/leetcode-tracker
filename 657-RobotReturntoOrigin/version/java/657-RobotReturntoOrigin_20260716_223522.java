// Last updated: 7/16/2026, 10:35:22 PM
1class Solution {
2    public int countSegments(String s) {
3        s = s.trim();
4
5        if (s.isEmpty())
6            return 0;
7
8        return s.split("\\s+").length;
9    }
10}