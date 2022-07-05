class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) <= 2:
            return []
        if len(nums) == 3:
            if sum(nums) == 0:
                return [nums]
            return []
        # if len(nums) >= 4 and len(set(nums)) == 1 and nums[0] == 0:
        #     return [[0,0,0]]            
        nums.sort()
        res = []
        for a in range(len(nums)-1):
            if a != 0 and nums[a] == nums[a-1]:
                # print(a)
                a += 1
                # print(a)
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
        # for i in range(len(nums)-2):
        #     for j in range(i+2,len(nums)):
        #         triplet = 0 - (nums[i] + nums[j])
        #         if triplet in nums[i+1:j] and ([nums[i],triplet,nums[j]] not in res):
        #             res.append([nums[i],triplet,nums[j]])
        return res
                