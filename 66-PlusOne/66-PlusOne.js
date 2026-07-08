// Last updated: 7/8/2026, 3:42:42 PM
/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let n=digits.length
    for(i=digits.length-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]+=1
            return digits
        }
        else {
            digits[i]=0
        }
    }
    digits.unshift(1)
    return digits
    
};