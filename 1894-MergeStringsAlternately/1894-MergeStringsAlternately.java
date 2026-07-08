// Last updated: 7/8/2026, 3:36:22 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result=new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()) result.append(word1.charAt(i));
            if(j<word2.length()) result.append(word2.charAt(j));
            i++;
            j++;

        }
        return result.toString();
        
    }
}