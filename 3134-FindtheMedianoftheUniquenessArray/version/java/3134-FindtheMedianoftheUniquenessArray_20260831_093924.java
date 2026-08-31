// Last updated: 8/31/2026, 9:39:24 AM
1class Solution {
2    public String removeTrailingZeros(String nums) {
3        int ind=0;
4        for(int i=nums.length()-1;i>=0;i--){
5             char ch=nums.charAt(i);
6             if(ch-'0'>0){
7                ind=i;
8                break;
9             }
10             else continue;
11        }
12        return nums.substring(0,ind+1);
13        
14    }
15}