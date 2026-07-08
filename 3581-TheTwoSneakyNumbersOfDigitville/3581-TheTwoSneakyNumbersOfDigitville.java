// Last updated: 7/8/2026, 3:33:00 PM
import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    indexList.add(nums[i]); 
                }
            }
        }

   
        int[] index = new int[indexList.size()];
        for (int k = 0; k < indexList.size(); k++) {
            index[k] = indexList.get(k);
        }

        return index;
    }
}
