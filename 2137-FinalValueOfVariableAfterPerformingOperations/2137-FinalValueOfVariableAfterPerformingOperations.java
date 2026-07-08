// Last updated: 7/8/2026, 3:35:50 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s:operations){
            if(s.equals("--X")){
                --x;
            }
            else if(s.equals("X++")){
                x++;
            }
            else if(s.equals("++X")){
                ++x;
            }
            else if(s.equals("X--")){
                x--;
            }
        }
        return x;
        
    }
}