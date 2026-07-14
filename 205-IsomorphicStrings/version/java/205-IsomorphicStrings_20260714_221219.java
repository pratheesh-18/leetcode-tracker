// Last updated: 7/14/2026, 10:12:19 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3
4        if (s.length() != goal.length())
5            return false;
6
7        return (s + s).contains(goal);
8    }
9}