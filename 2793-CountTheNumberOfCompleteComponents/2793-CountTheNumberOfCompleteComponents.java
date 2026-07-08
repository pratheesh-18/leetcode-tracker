// Last updated: 7/8/2026, 3:34:06 PM
class Solution {
   
    public static void dfs(int i,boolean[] visited,List<List<Integer>> list,List<Integer> comp){
        visited[i]=true;
        comp.add(i);
        for(int num:list.get(i)){
            if(!visited[num]) dfs(num,visited,list,comp);
        }

    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int j=0;j<edges.length;j++){
            int sv=edges[j][0];
            int ev=edges[j][1];
            list.get(sv).add(ev);
            list.get(ev).add(sv);
        }
        
        boolean[]  visited=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
              if (!visited[i]) {

                List<Integer> component = new ArrayList<>();

                dfs(i, visited, list, component);

                int nodes = component.size();
                int degreeSum = 0;

                for (int node : component) {
                    degreeSum += list.get(node).size();
                }

                int actualEdges = degreeSum ;
                int expectedEdges = nodes * (nodes - 1);

                if (actualEdges == expectedEdges) {
                    count++;
                }
            }
        }
        return count;

        
    }
}