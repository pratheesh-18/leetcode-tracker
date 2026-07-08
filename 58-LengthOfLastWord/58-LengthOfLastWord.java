// Last updated: 7/8/2026, 3:42:49 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] cleaned=s.trim().split(" ");
        int fulllength=cleaned.length;
        String last =cleaned[fulllength-1];
        return last.length();
    }
}