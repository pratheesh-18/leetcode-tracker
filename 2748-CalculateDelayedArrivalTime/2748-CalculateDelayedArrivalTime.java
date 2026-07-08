// Last updated: 7/8/2026, 3:34:19 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
        
    }
}