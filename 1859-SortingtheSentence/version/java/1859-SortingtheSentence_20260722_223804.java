// Last updated: 7/22/2026, 10:38:04 PM
1class Solution {
2    public String sortSentence(String s) {
3        String[] str=s.split(" ");
4        String[] res=new String[str.length];
5        StringBuilder sb=new StringBuilder();
6        int i=0;
7        for(String elem:str){
8            i=(int)(elem.charAt(elem.length()-1)-'0');
9            res[i-1]=elem.substring(0,elem.length()-1);
10
11        }
12        for (i = 0; i < res.length - 1; i++)
13		sb.append(res[i]).append(" ");
14	sb.append(res[i]);
15	return sb.toString();
16        
17    }
18}