import math
class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        return n>= 1 and n == 3 ** math.ceil(math.log(n)/math.log(3))
        
        