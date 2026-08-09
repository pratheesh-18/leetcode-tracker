// Last updated: 8/9/2026, 8:47:32 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        double tot=0;
6        int i=prices.length-1;
7        int j=discounts.length-1;
8        while(i>=0 && j>=0){
9            double disc=prices[i]*(100-discounts[j])/100.0;
10            tot+=disc;
11            i--;
12            j--;
13            
14        }
15         while (i >= 0) {
16            tot += prices[i];
17            i--;
18        }
19        return tot;
20        
21    }
22}