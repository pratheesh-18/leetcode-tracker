// Last updated: 9/26/2026, 3:01:23 PM
1class Solution {
2    public String evaluate(String s, List<List<String>> kn) {
3        Map<String, String> map=new HashMap<>();
4        for(var k:kn ){
5            map.put(k.get(0),k.get(1));
6        }
7        StringBuilder res=new StringBuilder();
8        for(int i=0;i<s.length();i++){
9            if(s.charAt(i)=='('){
10                int l=s.indexOf(')',i+1);
11                res.append(map.getOrDefault(s.substring(i+1,l),"?"));
12                i=l;
13
14            }
15            else
16            res.append(s.charAt(i));
17        }
18        return res.toString();
19        
20    }
21}