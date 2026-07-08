// Last updated: 7/8/2026, 3:32:07 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String alph="abcdefghijklmnopqrstuvwxyz";
        char[] arr=alph.toCharArray();
        String ans="";
        for(String word:words){
            int weight=0;
            for(int i=0;i<word.length();i++){
                weight+=weights[word.charAt(i)-'a'];

            }
            int rem=weight%26;
            ans+=(char)('z' - rem);
        }
        return ans;
        
    }
}