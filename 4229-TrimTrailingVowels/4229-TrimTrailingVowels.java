// Last updated: 7/8/2026, 3:32:00 PM
class Solution {
    public String trimTrailingVowels(String s) {
        StringBuffer sb=new StringBuffer(s);
        for(int i=sb.length()-1;i>=0;i--){
            char ch=sb.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch == 'o'||ch=='u'){
                sb.deleteCharAt(i);
            }
            else{
                return sb.toString();
            }
        }
        return sb.toString();
        
    }
}