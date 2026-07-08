// Last updated: 7/8/2026, 3:33:02 PM
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(bannedWords));
         int count = 0;
         for (String s : message) {
                if (bannedSet.contains(s)) count++;
                if(count>=2) return true;
         }
         return false;

        
    }
}