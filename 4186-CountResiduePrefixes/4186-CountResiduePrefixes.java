// Last updated: 7/8/2026, 3:32:10 PM
class Solution {
    public int residuePrefixes(String s) {
        int[] freq=new int[26];
        int dist=0;
        int result=0;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            
                if(freq[ind]==0) dist++;
                 freq[ind]++;
                int pref=i+1;
            if(pref%3==dist) result++;
            
        }
        return result;
        
        
    }
}