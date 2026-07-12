// Last updated: 7/12/2026, 8:18:36 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime)
3    {
4        String[] start=startTime.split(":");
5        String[] end=endTime.split(":");
6        int starthr=Integer.parseInt(start[0])*3600;
7        int startMin=Integer.parseInt(start[1])*60;
8        int startSec=Integer.parseInt(start[2]);
9
10        int endhr=Integer.parseInt(end[0])*3600;
11        int endMin=Integer.parseInt(end[1])*60;
12        int endSec=Integer.parseInt(end[2]);
13
14        int startTot=starthr+startMin+startSec;
15        int endTot=endhr+endMin+endSec;
16
17        return endTot-startTot;
18        
19    }
20}