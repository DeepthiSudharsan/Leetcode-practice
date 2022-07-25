class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        dig = 10 ** (len(digits)-1)
        num = 0
        for i in digits:
            num += i * dig
            dig//=10
        return list(str(num+1))
        