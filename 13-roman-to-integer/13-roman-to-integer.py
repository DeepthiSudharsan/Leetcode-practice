class Solution:
    def romanToInt(self, s: str) -> int:
        symb = {"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        ans = 0
        i = 0
        while i != len(s):
            if s[i] == "I":
                if i <= len(s)-2 and s[i+1] == "V":
                    ans += 4
                    i += 1
                elif i <= len(s)-2 and s[i+1] == "X":
                    ans += 9
                    i += 1
                else:
                    ans += symb[s[i]]
            elif s[i] == "X":
                if i <= len(s)-2 and s[i+1] == "L":
                    ans += 40
                    i += 1
                elif i <= len(s)-2 and s[i+1] == "C":
                    ans += 90
                    i += 1
                else:
                    ans += symb[s[i]]
            elif s[i] == "C":
                if i <= len(s)-2 and s[i+1] == "D" :
                    ans += 400
                    i += 1
                elif i <= len(s)-2 and s[i+1] == "M":
                    ans += 900
                    i += 1
                else:
                    ans += symb[s[i]]
            else:
                ans += symb[s[i]]
            i += 1
        return ans
            
                    
                    
        