// Last updated: 7/8/2026, 3:37:19 PM
class Solution {
    public int numberOfSteps(int n) {
        int steps=0;
        while(n!=0){
            if(n%2==0) n/=2;
            else n-=1;
            steps++;
        }
        return steps;
        
    }
}