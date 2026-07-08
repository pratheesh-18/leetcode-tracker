// Last updated: 7/8/2026, 3:37:03 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List <Boolean> val=new ArrayList();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>=max){
                max=candies[i];
            }
        }
        
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                val.add(true);
            }
            else{
                val.add(false);
            }
            

        }
        return val;

        
    }
}