// Last updated: 7/30/2026, 10:37:41 AM
1import java.util.*;
2
3class Solution {
4    public int findLucky(int[] arr) {
5        Map<Integer, Integer> map = new HashMap<>();
6
7        // Count frequency
8        for (int num : arr) {
9            map.put(num, map.getOrDefault(num, 0) + 1);
10        }
11
12        int largest = -1;
13
14        // Find the largest lucky integer
15        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
16            if (entry.getKey().equals(entry.getValue())) {
17                largest = Math.max(largest, entry.getKey());
18            }
19        }
20
21        return largest;
22    }
23}