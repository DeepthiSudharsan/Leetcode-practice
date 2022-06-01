class Solution:
    def isPalindrome(self, s: str) -> bool:
        st = [''+ i for i in s.lower() if i.isalnum()]
        return st == st[::-1]
        # s = list(s.lower())
        # st = ""
        # for i in s:
        #     if i.isalnum():
        #         st += i
        # return st == st[::-1]
        