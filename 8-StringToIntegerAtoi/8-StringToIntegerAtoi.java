// Last updated: 7/8/2026, 3:43:38 PM
class Solution {
    public int myAtoi(String s) {
       
        char[] ch = s.strip().toCharArray();
        if (ch.length == 0) return 0;

        int i = 0;
        int sign = 1;
        int result = 0;

        if (ch[i] == '-') {
            sign = -1;
            i++;
        } else if (ch[i] == '+') {
            i++;
        }

        while (i < ch.length && Character.isDigit(ch[i])) {
            int digit = ch[i] - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
            
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
