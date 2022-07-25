class Solution:
    def mySqrt(self, x: int) -> int:
        beg, en = 1,x
        mid = (beg + en)//2
        while not (mid * mid <= x and (mid+1)*(mid+1) > x):
            if mid * mid == x:
                return mid
            elif mid * mid < x:
                beg = mid
            else:
                en = mid
            mid = (beg + en)//2 
        return mid
        # for i in range(x//2 + 2):
        #     if i * i == x:
        #         return i
        #     if i * i > x:
        #         return i-1
            
        
        