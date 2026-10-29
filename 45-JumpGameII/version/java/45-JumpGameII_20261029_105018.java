// Last updated: 10/29/2026, 10:50:18 AM
1class Solution {
2    public int jump(int[] nums) {
3        int n = nums.length;
4        if (n <= 1) return 0;
5
6        int jumps = 0;
7        int currEnd = 0;
8        int maxReach = 0;
9
10        // Process indices until second last.
11        for (int i = 0; i < n - 1; i++) {
12            maxReach = Math.max(maxReach, i + nums[i]);
13
14            // End of current range => commit one jump.
15            if (i == currEnd) {
16                jumps++;
17                currEnd = maxReach;
18
19                // If this range already covers last index, stop.
20                if (currEnd >= n - 1) break;
21            }
22        }
23
24        return jumps;
25    }
26}