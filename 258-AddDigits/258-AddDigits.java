// Last updated: 7/8/2026, 3:40:43 PM
class Solution {
    public int addDigits(int num) {
     
        return (num==0)?0:num%9==0?9:num%9;

    }
}