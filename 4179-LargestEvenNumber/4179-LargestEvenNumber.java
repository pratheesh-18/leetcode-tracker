// Last updated: 7/8/2026, 3:32:11 PM
class Solution {
    public String largestEven(String s) {
        int two=s.lastIndexOf("2");
        if(two==-1) return "";
        else return s.substring(0,two+1);
        
    }
}