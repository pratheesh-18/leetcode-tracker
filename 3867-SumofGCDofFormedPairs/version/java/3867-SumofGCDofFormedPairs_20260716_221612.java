// Last updated: 7/16/2026, 10:16:12 PM
1class Solution {
2    public static int gcd(int a,int b){
3        while(b!=0){
4            int t=b;
5            b=a%b;
6            a=t;
7        }
8        return a;
9    }
10    public long gcdSum(int[] nums) {
11        int[] mx=new int[nums.length];
12        int[] pref=new int[nums.length];
13       
14        mx[0]=nums[0];
15        pref[0]=nums[0];
16        for(int i=1;i<nums.length;i++){
17            mx[i]=Math.max(mx[i-1],nums[i]);
18            pref[i]=gcd(mx[i],nums[i]);
19
20        }
21        Arrays.sort(pref);
22        long sum=0;
23        int i=0,j=nums.length-1;
24        while(i<j){
25            sum+=gcd(pref[i],pref[j]);
26            i++;
27            j--;
28
29        }
30        return sum;
31        
32    }
33}