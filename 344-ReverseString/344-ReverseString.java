// Last updated: 7/8/2026, 3:40:22 PM
import java.util.*;
class Solution {
    public void reverseString(char[] s) {
       int l=0;
       int r=s.length-1;

       while(l<r){
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;

        l++;
        r--;
       }

        
    }
}