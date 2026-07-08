// Last updated: 7/8/2026, 3:40:45 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        int a=s.length();
        int b=t.length();
        char[] Sarr=s.toCharArray();
        char[] Tarr=t.toCharArray();
        if(a!=b) return false;
        Arrays.sort(Sarr);
        Arrays.sort(Tarr);
        return Arrays.equals(Sarr,Tarr);
    }
}