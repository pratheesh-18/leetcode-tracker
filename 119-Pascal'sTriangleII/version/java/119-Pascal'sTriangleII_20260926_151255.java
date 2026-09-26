// Last updated: 9/26/2026, 3:12:55 PM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        Set seen = new HashSet<>();
4        Set rep=new HashSet<>();
5        for(int i=0;i+9<s.length();i++){
6            String sub=s.substring(i,i+10);
7            if(!seen.contains(sub)){
8                seen.add(sub);
9            }
10            else rep.add(sub);
11        }
12        return new ArrayList(rep);
13        
14    }
15}