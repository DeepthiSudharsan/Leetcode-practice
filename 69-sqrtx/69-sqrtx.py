class Solution:
    def mySqrt(self, x: int) -> int:
        for i in range(x//2 + 2):
            # if x == 0:
            #     return 0
            # if x == 1:
                # return 1
            if i * i == x:
                return i
            if i * i > x:
                return i-1
            
        
        