class Solution {
    public int scoreOfParentheses(String s) 
    {
        char[] ch = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == '(')
            {
                // opening brackets, push -1
                stack.push(-1);
            }
            else
            {
                // top of the stack is ( so () = 1
                if(stack.peek() == -1)
                {
                    stack.pop();
                    stack.push(1);
                }
                else
                {
                    // top of stack is ) so )) 
                    int val = 0;
                    while(!stack.isEmpty() && stack.peek()!=-1)
                    {
                        val = val + stack.pop();
                    }
                    stack.pop();
                    stack.push(2*val);
                }
            }
        }
        int val=0;
        while(stack.size()>0)
        {
            val=val+stack.pop();
        }
        return val;
    }
}