// Last updated: 7/8/2026, 3:32:47 PM
class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
             int prod=(26-(c[i]-'a'))*(i+1);
             sum+=prod;

        }
        return sum;
        
    }
}