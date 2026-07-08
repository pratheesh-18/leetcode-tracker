// Last updated: 7/8/2026, 3:34:15 PM
/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    var val;
    for(i=0; i<nums.length;i++){
         val=fn(init,nums[i])
         init = val

    }
    return init
    
};