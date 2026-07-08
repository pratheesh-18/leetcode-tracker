// Last updated: 7/8/2026, 3:38:19 PM
/**
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) {

  let newHeight= [...heights] .sort((a,b)=> a - b);
  let compare=[];
 

  for(let i=0; i<heights.length; i++){
    if(heights[i]!==newHeight[i]){
   
        compare.push(heights[i]);
    }
  }
  return compare.length;

}