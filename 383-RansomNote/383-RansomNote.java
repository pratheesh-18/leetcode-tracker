// Last updated: 7/8/2026, 3:40:14 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

      
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false; 
            }
        }

        return true;
    }
}
