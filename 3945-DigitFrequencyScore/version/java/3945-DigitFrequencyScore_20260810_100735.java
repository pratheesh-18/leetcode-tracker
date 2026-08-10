// Last updated: 8/10/2026, 10:07:35 AM
1class Solution {
2    public int digitFrequencyScore(int n) {
3       int sum = 0;
4      while( n>0){
5          int digit = n %10;
6          sum += digit;
7          n /=10;
8      }
9      return sum;  
10        
11    }
12}