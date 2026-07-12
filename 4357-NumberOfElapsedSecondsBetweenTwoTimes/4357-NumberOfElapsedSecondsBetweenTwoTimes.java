// Last updated: 7/12/2026, 10:06:52 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime)
    {
        String[] start=startTime.split(":");
        String[] end=endTime.split(":");
        int starthr=Integer.parseInt(start[0])*3600;
        int startMin=Integer.parseInt(start[1])*60;
        int startSec=Integer.parseInt(start[2]);

        int endhr=Integer.parseInt(end[0])*3600;
        int endMin=Integer.parseInt(end[1])*60;
        int endSec=Integer.parseInt(end[2]);

        int startTot=starthr+startMin+startSec;
        int endTot=endhr+endMin+endSec;

        return endTot-startTot;
        
    }
}