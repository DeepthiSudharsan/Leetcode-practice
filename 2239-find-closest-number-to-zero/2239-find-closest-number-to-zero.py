class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        temp = nums.copy()
        m = 99999999
        ll = []
        for i in range(len(nums)):
            temp[i] = abs(nums[i])
            if temp[i] < m:
                m = temp[i]
                ll = [nums[i]]
            elif temp[i] == m:
                ll.append(nums[i])
            else:
                continue
        return max(ll)
                
        
            
        