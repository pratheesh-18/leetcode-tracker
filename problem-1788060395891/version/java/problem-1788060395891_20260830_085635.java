// Last updated: 8/30/2026, 8:56:35 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Set<Integer> seen = new HashSet<>();
4        Set<Integer> bad = new HashSet<>();
5
6        for (int i = 0; i < nums.length; i++) {
7            if (i > 0 && nums[i] != nums[i - 1]) {
8                if (seen.contains(nums[i])) {
9                    bad.add(nums[i]);
10                }
11            }
12
13            seen.add(nums[i]);
14        }
15
16        return seen.size() - bad.size();
17        
18    }
19}