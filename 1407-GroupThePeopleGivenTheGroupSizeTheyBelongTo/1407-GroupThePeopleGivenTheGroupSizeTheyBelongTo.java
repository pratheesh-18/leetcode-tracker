// Last updated: 7/8/2026, 3:37:28 PM
class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < gs.length; i++) {
            int l = gs[i];
            map.putIfAbsent(l, new ArrayList<>());

            map.get(l).add(i);

            if (map.get(l).size() == l) {
                list.add(new ArrayList<>(map.get(l)));
                map.get(l).clear();
            }
        }
        return list;
    }
}
