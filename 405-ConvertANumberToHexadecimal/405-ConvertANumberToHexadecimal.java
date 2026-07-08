// Last updated: 7/8/2026, 3:40:04 PM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] c = "0123456789abcdef".toCharArray();
        StringBuffer sb = new StringBuffer();

        while (num != 0) {
            int d = num & 15;
            sb.append(c[d]);
            num >>>= 4;
        }

        return sb.reverse().toString();
    }
}
