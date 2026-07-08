// Last updated: 7/8/2026, 3:32:56 PM
class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int n:nums){
            int sum=0;
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            min=Math.min(min,sum);
        }
        return min;
        
    }
}