// Last updated: 7/8/2026, 3:33:32 PM
class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int n=nums1.length;
       
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        

        for(int nu1:nums1){
            s1.add(nu1);
        }
        for(int nu2:nums2){
            s2.add(nu2);
        }

        int keep1 = Math.min(s1.size(), n / 2);
        int keep2 = Math.min(s2.size(), n / 2);

        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);

        return Math.min(keep1 + keep2, union.size());
        
    }
}