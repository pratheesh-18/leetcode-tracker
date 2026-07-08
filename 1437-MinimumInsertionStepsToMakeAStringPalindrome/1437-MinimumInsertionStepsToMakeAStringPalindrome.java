// Last updated: 7/8/2026, 3:37:21 PM
class Solution {
      public static int helper(int m,int n,String w1,String w2,int[][] dp){
        if(m==0 || n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(w1.charAt(m-1)==w2.charAt(n-1)){
            dp[m][n]= 1+helper(m-1,n-1,w1,w2,dp);
            return dp[m][n];
        } 
        else{
            
             dp[m][n]=Math.max(helper(m-1,n,w1,w2,dp),helper(m,n-1,w1,w2,dp));
             return dp[m][n];
        }

    }
    public int minInsertions(String s) {
        StringBuilder sb=new StringBuilder(s).reverse();
        int m=s.length();
        int n=sb.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i],-1);
        }
        return m-helper(m,n,s,sb.toString(),dp);
        
    }
}