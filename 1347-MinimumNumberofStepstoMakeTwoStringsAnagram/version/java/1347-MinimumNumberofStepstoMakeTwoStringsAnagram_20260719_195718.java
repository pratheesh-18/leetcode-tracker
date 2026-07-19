// Last updated: 7/19/2026, 7:57:18 PM
1class Solution {
2    public String convert(String s, int numRows) {
3        ArrayList<ArrayList<Character>> l1=new ArrayList<>();
4         if (numRows == 1 || numRows >= s.length()) {
5            return s;
6        }
7        for(int i=0;i<numRows;i++){
8            l1.add(new ArrayList<>());
9        }
10        int ind=0,d=1;
11
12        for(char c:s.toCharArray()){
13            l1.get(ind).add(c);
14            if(ind==0){
15                d=1;
16            }
17            else if(ind==numRows-1){
18                d=-1;
19            }
20            ind+=d;
21
22        }
23        StringBuilder result = new StringBuilder();
24        for (List<Character> row : l1) {
25            for (char c : row) {
26                result.append(c);
27            }
28        }
29        return result.toString();
30
31
32        
33    }
34}