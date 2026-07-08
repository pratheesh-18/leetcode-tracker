// Last updated: 7/8/2026, 3:39:52 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       
        List<Integer> l1=new ArrayList<>();
        int[] pcount=new int[26];
        int[] scount=new int[26];
        int k=p.length();
         if (s.length() < p.length()) return l1;
    
        for(int i=0;i<k;i++){
            pcount[p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;
        }
       
        if(Arrays.equals(pcount,scount))l1.add(0);
        for(int i=k;i<s.length();i++){
            scount[s.charAt(i-k)-'a']--;
             scount[s.charAt(i)-'a']++;
            if(Arrays.equals(pcount,scount))l1.add(i-k+1);
        }
        return l1;
        
    }
}