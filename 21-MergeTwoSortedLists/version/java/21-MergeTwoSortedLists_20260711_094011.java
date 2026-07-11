// Last updated: 7/11/2026, 9:40:11 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummy = new ListNode();
14        ListNode cur = dummy;
15
16        while (list1 != null && list2 != null) {
17            if (list1.val > list2.val) {
18                cur.next = list2;
19                list2 = list2.next;
20            } else {
21                cur.next = list1;
22                list1 = list1.next;
23            }
24            cur = cur.next;
25        }
26
27        cur.next = (list1 != null) ? list1 : list2;
28
29        return dummy.next;        
30    }
31}