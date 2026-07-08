// Last updated: 7/8/2026, 3:41:53 PM
class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev="";
        for(int i=cleaned.length()-1;i>=0;i--){
            rev= rev + cleaned.charAt(i);
        }
        return rev.equals(cleaned);
    }
}