// Last updated: 7/13/2026, 9:58:49 AM
1class Solution {
2        public int minDeletion(int[] A) {
3        int res = 0, pre = -1;
4        for (int a : A) {
5            if (a == pre)
6                res++;
7            else
8                pre = pre < 0 ? a : -1;
9        }
10        return pre < 0 ? res : res + 1;
11    }
12}