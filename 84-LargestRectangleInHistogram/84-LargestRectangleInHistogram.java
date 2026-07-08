// Last updated: 7/8/2026, 3:42:25 PM
class Solution {
    public int largestRectangleArea(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && height[stk.peek()]>=height[i]) stk.pop();
            left[i]=stk.isEmpty()?-1:stk.peek();
            stk.push(i);
        }
        stk.clear();
         for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && height[stk.peek()]>=height[i]) stk.pop();
            right[i]=stk.isEmpty()?n:stk.peek();
            stk.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int area=height[i]*width;
            max=Math.max(area,max);
        }
        return max;

        
    }
}