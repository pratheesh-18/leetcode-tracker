// Last updated: 7/8/2026, 3:34:30 PM
/**
 * @param {number} n
 * @return {Function} counter
 */
 
var createCounter = function(n) {
    let num =n;
    return function(){
        return num++
    }
    
   
};



