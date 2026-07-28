// Last updated: 7/28/2026, 9:21:21 AM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int n=s.length();
4        if(n==1) return s;
5        String first=s.substring(0,n/2);
6        char[] firstCH=first.toCharArray();
7       
8
9        Arrays.sort(firstCH);
10     
11        StringBuilder sb=new StringBuilder();
12        sb.append(firstCH);
13        if (n % 2 == 1) {
14            sb.append(s.charAt(n / 2));
15        }
16
17        for (int i = firstCH.length - 1; i >= 0; i--) {
18            sb.append(firstCH[i]);
19        }
20        return sb.toString();
21        
22    }
23}