// Last updated: 7/8/2026, 3:43:17 PM
class Solution {
  
    public int longestValidParentheses(String s) {
        int n=s.length();
        int open=0;
        int close=0;
        int max=0;
      
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(') open++;
            else close++;
            if(open==close) max=Math.max(max,open+close);
            else if(close>open){
                open=close=0;
            }
        }
        open=close=0;
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(c==')') close++;
            else open++;
            if(open==close) max=Math.max(max,open+close);
            else if(open>close){
                open=close=0;
            }
        }
        return max;
        
    }
}