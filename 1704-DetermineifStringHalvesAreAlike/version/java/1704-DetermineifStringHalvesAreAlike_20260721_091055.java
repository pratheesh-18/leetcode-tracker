// Last updated: 7/21/2026, 9:10:55 AM
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        int[] freq=new int[26];
4        for(int i=0;i<sentence.length();i++){
5            char ch=sentence.charAt(i);
6            freq[ch-'a']++;
7        }
8        for(int f:freq){
9            if(f<1) return false;
10        }
11        return true;
12        
13    }
14}