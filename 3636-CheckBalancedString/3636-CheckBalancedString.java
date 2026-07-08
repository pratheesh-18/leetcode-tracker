// Last updated: 7/8/2026, 3:32:53 PM
class Solution {
    public boolean isBalanced(String num) {
        int even=0,odd=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0) {
                even +=num.charAt(i)-'0';
            }
            else odd+=num.charAt(i)-'0';

        }
        return even==odd;
        
    }
}