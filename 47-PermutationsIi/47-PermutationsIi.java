// Last updated: 7/8/2026, 3:43:04 PM
class Solution {
     public static void permutation(int[] nums,int i, List<List<Integer>> res){
        HashSet<Integer> set=new HashSet<>();
        if(i==nums.length-1){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
               
                temp.add(nums[j]);
                
            }
            res.add(temp);
            return;
            
        }
        for(int j=i;j<nums.length;j++){
             if(set.contains(nums[j])) continue;
             set.add(nums[j]);
            swap(nums,i,j);
            permutation(nums,i+1,res);
            swap(nums,i,j);
        }
        

    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permutation(nums,0,res);
        return res;
    }
}

    
    
   
    