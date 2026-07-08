// Last updated: 7/8/2026, 3:43:36 PM
class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,ans=0;
         int w=height.length-1;
        while(i<j){
            int min=Math.min(height[i],height[j]);
            int vol=w*min;
            ans=Math.max(ans,vol);
            if(height[i]<height[j]) i++;
            else j--;
            w--;

        }
        return ans;
        
    }
}