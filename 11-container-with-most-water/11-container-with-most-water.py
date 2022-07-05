class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) -1
        res = 0
        artemp = 0
        while(l < r):
            artemp = min(height[l],height[r]) * (r-l)
            res = max(res, artemp)
            if height[l] < height[r]:
                l +=1
            else:
                r-=1
        return res
            
        