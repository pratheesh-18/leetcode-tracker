// Last updated: 7/8/2026, 3:33:15 PM
class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int ind=t.indexOf(s.charAt(i));
            sum+=(int)Math.abs(ind-i);
        }
        return sum;
        
    }
}