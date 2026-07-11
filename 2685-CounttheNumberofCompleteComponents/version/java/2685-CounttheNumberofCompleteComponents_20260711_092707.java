// Last updated: 7/11/2026, 9:27:07 AM
1class Solution {
2   
3    public static void dfs(int i,boolean[] visited,List<List<Integer>> list,List<Integer> comp){
4        visited[i]=true;
5        comp.add(i);
6        for(int num:list.get(i)){
7            if(!visited[num]) dfs(num,visited,list,comp);
8        }
9
10    }
11    public int countCompleteComponents(int n, int[][] edges) {
12        List<List<Integer>> list=new ArrayList<>();
13        for(int i=0;i<n;i++){
14            list.add(new ArrayList<>());
15        }
16        for(int j=0;j<edges.length;j++){
17            int sv=edges[j][0];
18            int ev=edges[j][1];
19            list.get(sv).add(ev);
20            list.get(ev).add(sv);
21        }
22        
23        boolean[]  visited=new boolean[n];
24        int count=0;
25        for(int i=0;i<n;i++){
26              if (!visited[i]) {
27
28                List<Integer> component = new ArrayList<>();
29
30                dfs(i, visited, list, component);
31
32                int nodes = component.size();
33                int degreeSum = 0;
34
35                for (int node : component) {
36                    degreeSum += list.get(node).size();
37                }
38
39                int actualEdges = degreeSum ;
40                int expectedEdges = nodes * (nodes - 1);
41
42                if (actualEdges == expectedEdges) {
43                    count++;
44                }
45            }
46        }
47        return count;
48
49        
50    }
51}