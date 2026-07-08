// Last updated: 7/8/2026, 3:41:50 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int totCost=0,remGas=0,ans=0;
      for(int i=0;i<gas.length;i++){
        totCost+=gas[i]-cost[i];
        remGas+=gas[i]-cost[i];
        if(remGas<0) {
            remGas=0;
            ans=i+1;
      }
      }
      return totCost>=0?ans:-1;
    }
}