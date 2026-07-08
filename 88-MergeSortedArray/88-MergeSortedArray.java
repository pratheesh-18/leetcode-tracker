// Last updated: 7/8/2026, 3:42:23 PM
import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> newarr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            newarr.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            newarr.add(nums2[i]);
        }

        Collections.sort(newarr);

        for (int i = 0; i < newarr.size(); i++) {
            nums1[i] = newarr.get(i);
        }
    }
}
