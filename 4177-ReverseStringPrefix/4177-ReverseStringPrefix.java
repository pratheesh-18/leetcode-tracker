// Last updated: 7/8/2026, 3:32:15 PM
class Solution {
    public String reversePrefix(String s, int k) {
        String sub=s.substring(0,k);
        StringBuffer sb=new StringBuffer(sub).reverse();
        String con=sb.toString().concat(s.substring(k,s.length()));
        return con;
        
    }
}