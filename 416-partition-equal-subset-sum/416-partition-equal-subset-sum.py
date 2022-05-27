class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        if sum(nums) % 2:
            return False
        dp = set()
        dp.add(0)
        target = sum(nums) // 2
        
        for i in range(len(nums)-1,-1,-1):
            subsum = []
            for t in dp:
                if t + nums[i] == target:
                    return True
                subsum.append(t + nums[i])
            dp.update(subsum)
        return False