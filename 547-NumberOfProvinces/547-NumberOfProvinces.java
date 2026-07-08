// Last updated: 7/8/2026, 3:39:29 PM
class Solution {
    public static void bfs(int i,boolean[] visit,int[][] connected){
        visit[i]=true;
        for(int j=0;j<connected.length;j++){
            if(connected[i][j]==1 && visit[j]!=true)
            bfs(j,visit,connected);
        }

    }
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        boolean[] visited=new boolean[v];
        int count=0;
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                count++;
                bfs(i,visited,isConnected);
            }
        }
        return count;
        
    }
}