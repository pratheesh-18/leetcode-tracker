// Last updated: 7/8/2026, 3:35:56 PM
class Solution {
    public static boolean bfs(int s,int dest,List<List<Integer>> list,int n){
    Queue<Integer> q = new LinkedList<>();
    boolean[] visited = new boolean[n];

    q.add(s);
    visited[s] = true;

    while(!q.isEmpty()){
        int curr = q.poll();
        for(int num : list.get(curr)){
            if(!visited[num]){
                q.add(num);
                visited[num] = true;
            }
        }
    }
    return visited[dest];
    
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int sv=edges[i][0];
            int ev=edges[i][1];
            list.get(sv).add(ev);
            list.get(ev).add(sv);
        }
       return  bfs(source,destination,list,n);
        
    }
}