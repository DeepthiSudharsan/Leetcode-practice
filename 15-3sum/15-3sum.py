class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) <= 2:
            return []
        if len(nums) == 3:
            if sum(nums) == 0:
                return [nums]
            return []           
        nums.sort()
        res = []
        for a in range(len(nums)-1):
            if a != 0 and nums[a] == nums[a-1]:
                a += 1
            else:
                b = a+1
                c = len(nums)-1
                while(b!=c):
                    if nums[b]+nums[c] == -nums[a]:
                        if [nums[a],nums[b],nums[c]] not in res:
                            res.append([nums[a],nums[b],nums[c]])
                        b += 1
                    elif nums[b]+nums[c] > -nums[a]:
                        c -=1
                    elif nums[b]+nums[c] < -nums[a]:
                        b +=1      
        return res
                