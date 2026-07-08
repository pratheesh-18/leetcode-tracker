// Last updated: 7/8/2026, 3:37:15 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        double min=6.0*minutes;
        double hr=30.0*(hour%12)+0.5*minutes;
        double diff =Math.abs(hr-min);
        return Math.min(diff,360-diff);
        
    }
}