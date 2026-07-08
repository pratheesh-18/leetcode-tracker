// Last updated: 7/8/2026, 3:35:52 PM
class Solution {
    public long interchangeableRectangles(int[][] rect) {
        HashMap<Double,Integer> freq=new HashMap<>();
        long pairs=0;
        for(int[] r:rect){
            double ratio=(double)r[0]/r[1];
            pairs+=freq.getOrDefault(ratio,0);
            freq.put(ratio,freq.getOrDefault(ratio,0)+1);
        }
        return pairs;
        
        
    }
}