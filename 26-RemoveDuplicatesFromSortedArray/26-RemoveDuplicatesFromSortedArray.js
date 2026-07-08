// Last updated: 7/8/2026, 3:43:29 PM
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
   
    i=0
        for(j=1; j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++
                nums[i]=nums[j]
            }
            
        }
    
    return i+1

   
    
};