// Last updated: 7/8/2026, 3:34:21 PM
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var newarray=[]
    for(i=0;i<arr.length;i++){
        newarray.push(fn(arr[i],i))

    }
    return newarray
    
};