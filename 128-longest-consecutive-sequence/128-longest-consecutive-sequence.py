class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        maxlen = 0
        # nums.sort()
        temp = 0
        if len(nums) == 0:
            return 0
        nos = sorted(list(set(nums)))
        for i in range(len(nos)-1):
            if nos[i] == nos[i+1] - 1:
                temp +=1
            else:
                if maxlen <= temp:
                    maxlen = temp
                temp = 0
        if maxlen <= temp:
            maxlen = temp
        return maxlen + 1
            
            
        