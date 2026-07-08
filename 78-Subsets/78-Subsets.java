// Last updated: 7/8/2026, 3:42:29 PM
class Solution {

    public void subset(int i, int[] nums, List<Integer> temp ,List<List<Integer>> list) {

        if (i == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        subset(i + 1, nums, temp, list);
        temp.remove(temp.size() - 1);
        subset(i + 1, nums, temp, list);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subset(0, nums, new ArrayList<>(), list);

        return list;
    }
}