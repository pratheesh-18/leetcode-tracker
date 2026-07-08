// Last updated: 7/8/2026, 3:36:59 PM
class Solution {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int count = 0;

       
        for(int i = 0; i < k; i++){
            if(isVowel(arr[i])) count++;
        }

        int max = count;

   
        for(int i = k; i < arr.length; i++){
            if(isVowel(arr[i])) count++;      
            if(isVowel(arr[i - k])) count--;   
            max = Math.max(max, count);
        }
        return max;
    }

    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
