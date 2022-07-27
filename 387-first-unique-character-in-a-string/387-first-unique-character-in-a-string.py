class Solution:
    def firstUniqChar(self, s: str) -> int:
        for k,v in collections.Counter(s).items():
            if v == 1:
                return s.index(k)
        return -1
        # for i in range(len(s)):
        #     if s.count(s[i]) == 1:
        #         return i
        # return -1
        