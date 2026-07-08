// Last updated: 7/8/2026, 3:37:01 PM
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words=sentence.split(" ");
        int ans=-1;
        for(int i=words.length-1;i>=0;i--){
            if(words[i].startsWith(searchWord)){
                ans=i;
            }


        }
        if(ans!=-1) return ans+1;
        else return ans;
        
        
    }
}