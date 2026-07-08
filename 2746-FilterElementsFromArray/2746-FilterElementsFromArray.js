// Last updated: 7/8/2026, 3:34:25 PM
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    var newarray=[];
    for(i=0;i<arr.length;i++){
         if(fn(arr[i],i)){

            newarray.push(arr[i])
         }
    }
    return newarray
    
    
};