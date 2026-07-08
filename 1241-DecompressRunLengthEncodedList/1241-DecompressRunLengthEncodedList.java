// Last updated: 7/8/2026, 3:38:00 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0,j=1;
        while(i<n || j<n){
            for(int k=0;k<nums[i];k++){
                arr.add(nums[j]);
            }
            i+=2;
            j+=2;
        }
        int[] ans=new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            ans[k]=arr.get(k);
        }
        return ans;
        
    }
}