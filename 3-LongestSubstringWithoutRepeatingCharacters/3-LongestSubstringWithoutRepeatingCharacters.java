// Last updated: 7/8/2026, 3:43:44 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n=s.length();
      int maxlen=0;
      for(int i=0;i<n;i++){
        int[] freq=new int[256];
        for(int j=i;j<n;j++){
            if(freq[s.charAt(j)]>0){
                   break;
            }
            else {
                freq[s.charAt(j)]++;
                 maxlen=Math.max(maxlen,j-i+1);
            }
           


        }
      }
      return maxlen;
        
    }
}