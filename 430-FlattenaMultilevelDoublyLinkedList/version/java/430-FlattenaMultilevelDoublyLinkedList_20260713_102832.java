// Last updated: 7/13/2026, 10:28:32 AM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3       PriorityQueue<Integer> pq=new PriorityQueue<>();
4    
5       
6       for(int i=0;i<nums.length;i++){
7          pq.offer(nums[i]);
8          if(pq.size()>k) pq.poll();
9        }
10       
11
12       
13       return pq.peek();
14        
15    }
16}