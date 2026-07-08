// Last updated: 7/8/2026, 3:32:30 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        if (friends.length == 0) return friends;

        int index = 0; 

        for (int o : order) {
            for (int f : friends) {
                if (f == o) {
                    ans[index++] = f;
                    break;
                }
            }
        }

        return ans;
    }
}
