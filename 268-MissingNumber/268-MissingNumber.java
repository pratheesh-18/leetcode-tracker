// Last updated: 7/8/2026, 3:40:39 PM
import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
    
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]) return i;
        }
        return nums.length;

    }
}