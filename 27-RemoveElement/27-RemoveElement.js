// Last updated: 7/8/2026, 3:43:23 PM
/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {

    let i=0
    for(j=0;j<nums.length;j++){
        if(val!=nums[j]){
            nums[i]=nums[j]
            i++

        }
    }
    return i
   
    
    
};