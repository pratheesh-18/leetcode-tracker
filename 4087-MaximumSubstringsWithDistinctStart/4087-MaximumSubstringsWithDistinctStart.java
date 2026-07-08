// Last updated: 7/8/2026, 3:32:23 PM
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        return set.size();

        
    }
}