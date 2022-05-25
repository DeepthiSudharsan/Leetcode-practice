class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res = max(nums)
        minele, maxele = 1,1
        for n in nums:
            if n == 0:
                minele, maxele = 1,1
            else:
                temp = n * minele
                minele = min(temp, n * maxele, n)
                maxele = max(temp, n * maxele, n)
                res = max(res, maxele)
        return res
        