// Last updated: 7/8/2026, 3:39:25 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] s1count = new int[26];
        int[] s2count = new int[26];

        int k = s1.length();
        for (int i = 0; i < k; i++) {
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1count, s2count)) {
            return true;
        }

        for (int i = k; i < s2.length(); i++) {

            s2count[s2.charAt(i - k) - 'a']--;
            s2count[s2.charAt(i) - 'a']++;

            if (Arrays.equals(s1count, s2count)) {
                return true;
            }
        }

        return false;
    }
}