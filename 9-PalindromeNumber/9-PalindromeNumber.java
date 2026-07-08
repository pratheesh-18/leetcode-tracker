// Last updated: 7/8/2026, 3:43:37 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int org=x;
        int rev=0;
        while(x!=0){
            rev=rev*10+x%10;
            x/=10;
        }
        return (org==rev)?true:false;
    }
}