class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:          
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
                        res.append([nums[a],nums[b],nums[c]])
                        b += 1
                        while(nums[b] == nums[b-1] and b != c):
                            b +=1
                    elif nums[b]+nums[c] > -nums[a]:
                        c -=1
                    elif nums[b]+nums[c] < -nums[a]:
                        b +=1      
        return res
                