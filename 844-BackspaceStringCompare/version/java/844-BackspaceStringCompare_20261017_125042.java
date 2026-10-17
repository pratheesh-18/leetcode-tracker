// Last updated: 10/17/2026, 12:50:42 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3
4        StringBuilder str1 = new StringBuilder();
5        StringBuilder str2 = new StringBuilder();
6
7        // Process string s
8        for (int i = 0; i < s.length(); i++) {
9            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
10                str1.append(s.charAt(i));
11            }
12            else if (s.charAt(i) == '#' && str1.length() > 0) {
13                str1.deleteCharAt(str1.length() - 1);
14            }
15        }
16
17        // Process string t
18        for (int i = 0; i < t.length(); i++) {
19            if (t.charAt(i) >= 'a' && t.charAt(i) <= 'z') {
20                str2.append(t.charAt(i));
21            }
22            else if (t.charAt(i) == '#' && str2.length() > 0) {
23                str2.deleteCharAt(str2.length() - 1);
24            }
25        }
26
27        return str1.toString().equals(str2.toString());
28    }
29}