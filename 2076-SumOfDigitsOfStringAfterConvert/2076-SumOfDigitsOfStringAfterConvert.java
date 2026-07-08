// Last updated: 7/8/2026, 3:36:07 PM
class Solution {
    
    public int getLucky(String s, int k) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            sb.append(c-96);
        }
        
        int sum=0;
        for(int i=1;i<=k;i++){
            sum=0;
            for(int j=0;j<sb.length();j++){
                int d=sb.charAt(j)-'0';
                sum+=d;
            }
            sb.delete(0,sb.length());
            sb.append(sum);

        }
        return sum;
        
        
    }
}