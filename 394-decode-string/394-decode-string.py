class Solution:
    def decodeString(self, s: str) -> str:
        if len(s) == 1:
            if s.isalpha(): 
                return s
            else:
                return ""
        stack = []
        for c in s:
            if c != ']':
                stack.append(c)
            else:
                temp_s = ''
                temp_num = 0
                count = -1
                while stack[-1] != '[':
                    temp_s = stack.pop() + temp_s
                stack.pop()
                for i in range(len(stack)-1, -1, -1):
                    count += 1
                    if stack[i].isnumeric():
                        temp_num += int(stack[i]) * (10 ** count)
                    else:
                        count -= 1
                        break   
                for j in range(count+1):
                    stack.pop()
                for k in (temp_num * temp_s):
                    stack.append(k)
        return ''.join(stack)
            
            
            
            
        
        
        