// Last updated: 7/8/2026, 3:37:35 PM
class Solution {
    public boolean checkStraightLine(int[][] cordi) {
        int x =cordi[0][0];
        int y=cordi[0][1];
        int x1=cordi[1][0];
        int y1=cordi[1][1];
        for(int i=2;i<cordi.length;i++){
            int x2=cordi[i][0];
            int y2=cordi[i][1];
            if(((x-x1)*(y2-y1))!=((y-y1)*(x2-x1))) return false;
        }
        return true;
    }
}