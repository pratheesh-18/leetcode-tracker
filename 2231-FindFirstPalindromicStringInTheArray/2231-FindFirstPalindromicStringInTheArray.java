// Last updated: 7/8/2026, 3:35:41 PM
class Solution {
    public String firstPalindrome(String[] words) {
        for(String w:words){
           StringBuffer sb=new StringBuffer(w).reverse();
           if(w.equals(sb.toString())) return w;

        }
        return "";
        
    }
}