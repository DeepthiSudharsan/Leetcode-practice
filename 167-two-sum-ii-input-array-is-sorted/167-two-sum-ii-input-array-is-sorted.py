class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        endval = target
        if (numbers[0] <0 and numbers[len(numbers)-1] <0) or (numbers[0] >=0 and numbers[len(numbers)-1] >=0):
            for i in range(len(numbers)):
                if numbers[i] <=target:
                    if target - numbers[i] in numbers[i+1:len(numbers)]:
                        return [i + 1,numbers[i+1:len(numbers)].index(target-numbers[i])+i+1 + 1]
        else:
            for i in range(len(numbers)-1,-1,-1):
                    if target - numbers[i] in numbers[0:i]:
                        return [numbers[0:i].index(target-numbers[i]) + 1,i+1]
        