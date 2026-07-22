// Last updated: 7/22/2026, 10:45:17 PM
1
2import java.util.*;
3
4class Solution {
5    public boolean makeEqual(String[] words) {
6        Map<Character, Integer> counts = new HashMap<>();
7        
8        for (String word : words) {
9            for (char c : word.toCharArray()) {
10                counts.put(c, counts.getOrDefault(c, 0) + 1);
11            }
12        }
13        
14        int n = words.length;
15        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
16            if (entry.getValue() % n != 0) {
17                return false;
18            }
19        }
20        
21        return true;
22    }
23}
24