// Last updated: 7/8/2026, 3:43:26 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='(' || c[i]=='[' || c[i]=='{'){
                stk.push(c[i]);
            }
            else{
                if (stk.isEmpty()) return false;
             char top = stk.peek();
              if ((c[i] == ')' && top == '(') || (c[i] == ']' && top == '[') || (c[i] == '}' && top == '{')) {
                 stk.pop();
                  
                  } else { return false; }
            }
        }
        return stk.isEmpty();
        
    }
}