// Last updated: 7/8/2026, 3:35:11 PM
class Solution {
    public int[] findArray(int[] pref) {
        int i=0,j=i+1;
        int[] arr=new int[pref.length];
        int index=0;
        arr[index++]=pref[0];
        while(j<pref.length){
            arr[index++]=pref[i]^pref[j];
            i++;
            j++;
        }
        return arr;
        
    }
}