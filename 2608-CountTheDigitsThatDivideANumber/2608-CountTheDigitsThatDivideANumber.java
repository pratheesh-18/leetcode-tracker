// Last updated: 7/8/2026, 3:34:53 PM
class Solution {
    public int countDigits(int num) {
        int init=num;
        int count=0;
        while(num!=0){
            int last=num%10;
            if(init%last==0) count++;
            num/=10;
        }
        return count;

        
    }
}