// Last updated: 7/8/2026, 3:41:32 PM
class MinStack {
    public Stack<Integer> stk;
    public Stack<Integer> min;

    public MinStack() {
        stk=new Stack();
        min=new Stack();
        
    }
    
    public void push(int val) {
        stk.push(val);
        if(min.size()>0){
        val=Math.min(min.peek(),val);
        }
        min.push(val);
    }
    
    public void pop() {
        stk.pop();
        min.pop();
        
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */