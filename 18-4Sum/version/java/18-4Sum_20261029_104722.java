// Last updated: 10/29/2026, 10:47:22 AM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        int n = nums.length;
5
6        // Sort to use two pointers and skip duplicates
7        Arrays.sort(nums);
8
9        for(int i = 0; i < n; i++) {
10            // Skip duplicate first elements
11            if(i > 0 && nums[i] == nums[i - 1]) continue;
12
13            for(int j = i + 1; j < n; j++) {
14                // Skip duplicate second elements
15                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
16
17                int k = j + 1;
18                int l = n - 1;
19
20                // Find the remaining two elements using two pointers
21                while(k < l) {
22                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
23
24                    if(sum == target) {
25                        // Found a valid quadruplet
26                        ans.add(Arrays.asList(
27                            nums[i], nums[j], nums[k], nums[l]
28                        ));
29
30                        k++;
31                        l--;
32
33                        // Skip duplicate third elements
34                        while(k < l && nums[k] == nums[k - 1]) k++;
35
36                        // Skip duplicate fourth elements
37                        while(k < l && nums[l] == nums[l + 1]) l--;
38                    }
39                    else if(sum < target) {
40                        // Need a larger sum
41                        k++;
42                    }
43                    else {
44                        // Need a smaller sum
45                        l--;
46                    }
47                }
48            }
49        }
50
51        return ans;
52    }
53}