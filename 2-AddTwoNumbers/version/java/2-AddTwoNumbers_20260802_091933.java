// Last updated: 8/2/2026, 9:19:33 AM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy=new ListNode();
14        ListNode res=dummy;
15       
16        int carry=0,total=0;
17        while(l1!=null || l2!=null || carry!=0){
18            total=carry;
19             if (l1 != null) {
20                total += l1.val;
21                l1 = l1.next;
22            }
23            if (l2 != null) {
24                total += l2.val;
25                l2 = l2.next;
26            }
27            int num=total%10;
28            carry=total/10;
29            dummy.next=new ListNode(num);
30            dummy=dummy.next;
31            
32
33        }
34        return res.next;
35        
36    }
37}