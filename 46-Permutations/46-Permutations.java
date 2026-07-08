// Last updated: 7/8/2026, 3:43:06 PM
class Solution {
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
    public static void permutation(int[] nums,int i, List<List<Integer>> res){
        if(i==nums.length-1){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                temp.add(nums[j]);
            }
            res.add(temp);
            return;
            
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            permutation(nums,i+1,res);
            swap(nums,i,j);
        }
        

    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
        permutation(nums,0,res);
        return res;
        
    }
}