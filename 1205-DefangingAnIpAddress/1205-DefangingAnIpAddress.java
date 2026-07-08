// Last updated: 7/8/2026, 3:38:06 PM
class Solution {
    public String defangIPaddr(String address) {
        String ip=address.replace(".","[.]");
        return ip;
        
    }
}