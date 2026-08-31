// Last updated: 8/31/2026, 9:28:32 AM
1class Solution {
2    public int[] nodesBetweenCriticalPoints(ListNode head) {
3
4        int first = -1;
5        int last = -1;
6        int idx = 1;
7        int min = Integer.MAX_VALUE;
8
9        ListNode prev = head;
10        ListNode curr = head.next;
11
12        while (curr.next != null) {
13
14            if ((curr.val > prev.val && curr.val > curr.next.val) ||
15                (curr.val < prev.val && curr.val < curr.next.val)) {
16
17                if (first == -1) {
18                    first = idx;
19                    last = idx;
20                }
21
22                else {
23                    min = Math.min(min, idx - last);
24                    last = idx;
25                }
26            }
27
28            prev = curr;
29            curr = curr.next;
30            idx++;
31        }
32        if (first == last) {
33            return new int[]{-1, -1};
34        }
35
36        return new int[]{min, last - first};
37    }
38}