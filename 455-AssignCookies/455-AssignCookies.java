// Last updated: 7/8/2026, 3:39:47 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n1=g.length-1;
        int n2=s.length-1;
        int i=0,j=0,count=0;
        while(i<=n1 && j<=n2){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            } 
            else if(s[j]<=g[i]) j++;
        }
        return count;

        
    }
}