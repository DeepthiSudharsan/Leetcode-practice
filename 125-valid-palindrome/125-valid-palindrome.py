class Solution:
    def isPalindrome(self, s: str) -> bool:
        st = [''+ i for i in s.lower() if i.isalnum()]
        # s = ''.join(_ for _ in s.lower() if _.isalnum())
        return st == st[::-1]
        