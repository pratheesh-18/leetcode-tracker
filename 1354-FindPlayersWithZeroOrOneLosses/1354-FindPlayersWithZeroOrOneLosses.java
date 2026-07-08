// Last updated: 7/8/2026, 3:37:34 PM
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        List<List<Integer>> players=new ArrayList();
        Map<Integer,Integer> map=new HashMap<>();

        for(int mat[]:matches){
            int winner=mat[0];
            int loss=mat[1];
            
            map.putIfAbsent(winner, 0);
            map.put(loss, map.getOrDefault(loss, 0) + 1);
            
        }
        List<Integer> l0=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
         for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue()==0) l0.add(e.getKey());
            else if(e.getValue()==1) l1.add(e.getKey());
            
        }
        Collections.sort(l0);
        Collections.sort(l1);
        players.add(l0);
        players.add(l1);

        return players;
        
    }
}