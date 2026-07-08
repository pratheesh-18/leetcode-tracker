// Last updated: 7/8/2026, 3:43:31 PM
/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    
    let prefix="";
     let first = strs[0];
    if(strs.length==0){
        return prefix
    }
    else{
   
    for(i=0;i<first.length;i++){
        
        for(j=1;j<strs.length;j++){
            if(i >= strs[j].length || strs[j][i]!=first[i]){

                return prefix

            }
        }
        prefix+=first[i]
       
    }
    }
    return prefix
    
};