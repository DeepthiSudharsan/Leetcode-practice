class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = list(s.lower())
        st = ""
        for i in s:
            if i.isalnum():
                st += i
        return st == st[::-1]
        