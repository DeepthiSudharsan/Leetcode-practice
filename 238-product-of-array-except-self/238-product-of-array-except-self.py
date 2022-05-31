class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        postfix = 1
        res = [1] * len(nums)
        for i in range(1,len(res)):
            res[i] = res[i-1] * nums[i-1]
        for j in range(len(res)-1,-1,-1):
            res[j] *= postfix
            postfix *= nums[j]
        return res
            
            
        