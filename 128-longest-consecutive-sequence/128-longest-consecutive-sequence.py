class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
#         numSet = set(nums)
#         longest = 0
        
#         for n in nums:
#             # check if its the start of a sequence
#             if (n - 1) not in numSet:
#                 length = 1
#                 while (n + length) in numSet:
#                     length += 1
#                 longest = max(length, longest)
#         return longest
         
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
            
            
        