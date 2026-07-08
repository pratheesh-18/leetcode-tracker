// Last updated: 7/8/2026, 3:39:34 PM
class Solution {
    public static int helper(int m,int n,String text1,String text2,int[][] dp){
          if(m==0 || n==0) return 0;
            
          if(text1.charAt(m-1)==text2.charAt(n-1)){
            int ans=1+helper(m-1,n-1,text1,text2,dp);
            dp[m][n]=ans;
            return dp[m][n];
          } 
          if(dp[m][n]!=-1) return dp[m][n];
        
          else{
            dp[m][n]=Math.max(helper(m-1,n,text1,text2,dp),helper(m,n-1,text1,text2,dp));
            return dp[m][n];
          }
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s).reverse();
        int m=s.length();
        int n=sb.length();
         int[][] dp=new int[m+1][n+1];
         for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
         }
        return helper(m,n,s,sb.toString(),dp);
        
    }
}