// Last updated: 7/8/2026, 3:42:31 PM
class Solution {
    public void sortColors(int[] nums) {
        int ZI=0,TI=nums.length-1;
        int i=0;
        while(i<=TI){
            if(nums[i]==0){
            int t=nums[ZI];
            nums[ZI]=0;
            nums[i]=t;
            i++;
            ZI++;
            }
            else if(nums[i]==1) i++;
            else{
                int t=nums[TI];
                nums[TI]=2;
                nums[i]=t;
                TI--;
            }
        }


        
    }
}