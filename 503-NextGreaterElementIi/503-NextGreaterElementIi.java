// Last updated: 7/8/2026, 3:39:39 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk=new Stack<>();
        int[] res=new int[nums.length];
        Arrays.fill(res,-1);
        for(int i=0;i<nums.length*2;i++){
            int x=nums[i%nums.length];
            while(!stk.empty() && x>nums[stk.peek()]){
                res[stk.pop()]=x;
            }
            stk.push(i%nums.length);
        }
        return res;
        
    }
}