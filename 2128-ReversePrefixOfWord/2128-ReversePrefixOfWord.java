// Last updated: 7/8/2026, 3:35:54 PM
class Solution {
    void rev(char arr[],int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public String reversePrefix(String word, char ch) {
        char arr[]=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                rev(arr,0,i);
                return new String(arr);
            }
        }
        return word;
        
        
    }
}