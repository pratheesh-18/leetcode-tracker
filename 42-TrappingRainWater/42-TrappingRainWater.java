// Last updated: 7/8/2026, 3:43:08 PM
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] pref=new int[n];
        int[] suff=new int[n];
        int ans=0;
        pref[0]=height[0];
        suff[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            pref[i]=Math.max(pref[i-1],height[i]);

        }
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.max(suff[i+1],height[i]);

        }
        for(int i=0;i<n;i++){
            int min_h=Math.min(suff[i],pref[i]);
            ans+=min_h-height[i];

        }
        return ans;
        
    }
}