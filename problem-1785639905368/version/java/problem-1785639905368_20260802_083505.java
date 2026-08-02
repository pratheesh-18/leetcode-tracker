// Last updated: 8/2/2026, 8:35:05 AM
1class Solution {
2    public static int GCD(int a,int b){
3        while(b!=0){
4            int t=b;
5            b=a%b;
6            a=t;
7        }
8        return a;
9    }
10    public long maxPairStrength(int[] nums) {
11        int n=nums.length;
12        long max=0;
13        for(int i=0;i<n;i++){
14            for(int j=i+1;j<n;j++){
15                long prod=1l*nums[i]*nums[j];
16                int gcd=GCD(nums[i],nums[j]);
17                long sqr=1l*gcd*gcd;
18                max=Math.max(max,prod/sqr);
19                
20            }
21        }
22        return max;
23        
24    }
25}