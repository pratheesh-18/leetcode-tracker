// Last updated: 7/8/2026, 3:40:19 PM
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
         
         for(int n:nums1){
             set1.add(n);

         }
         for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
         }
         int[] arr=new int[set2.size()];
         int i=0;
         for(int num:set2){
            arr[i++]=num;
         }
         return arr;

       

        
    }
}