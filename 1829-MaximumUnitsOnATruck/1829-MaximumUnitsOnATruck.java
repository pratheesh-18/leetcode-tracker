// Last updated: 7/8/2026, 3:36:28 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int ans=0;
        for(int i=0;i<boxTypes.length;i++){
            int num=boxTypes[i][0];
            int q=boxTypes[i][1];
            int taken=Math.min(num,truckSize);
            ans+=(taken*q);
            truckSize-=taken;
        }
        return ans;
        
    }
}