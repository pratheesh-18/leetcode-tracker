// Last updated: 7/8/2026, 3:39:26 PM
class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(String w:words){
            StringBuffer tmp=new StringBuffer(w);
            sb.append(tmp.reverse()+" ");
        }
        return sb.toString().trim();
        
    }
}