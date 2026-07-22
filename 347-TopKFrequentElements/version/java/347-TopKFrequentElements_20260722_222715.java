// Last updated: 7/22/2026, 10:27:15 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        for (int num : nums) {
7            map.put(num, map.getOrDefault(num, 0) + 1);
8        }
9        PriorityQueue<Map.Entry<Integer, Integer>> pq =
10                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
11
12        pq.addAll(map.entrySet());
13
14        int[] ans = new int[k];
15
16        for (int i = 0; i < k; i++) {
17            ans[i] = pq.poll().getKey();
18        }
19
20        return ans;
21    }
22}