class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        r,c = len(matrix), len(matrix[0])
        rowl, rowr, colu, cold = 0,c-1, 0, r-1
        i,j = 0,c-1
        flag = 0
        res = []
        while(rowl<=rowr  and colu<=cold):
            if flag % 4 == 0:
                # right
                res.extend(matrix[i][rowl:rowr+1])                   
                colu +=1
            elif flag % 4 == 1:
                # down
                res.extend([matrix[k][j] for k in range(colu,cold+1)])
                rowr -=1
            elif flag % 4 == 2:
                # left
                res.extend(matrix[r - i - 1][rowl:rowr+1][::-1])
                cold -=1
                i+=1
            elif flag % 4 == 3:
                # up
                res.extend([matrix[k][c - j - 1] for k in range(colu,cold+1)][::-1])
                rowl += 1
                j -=1
            flag +=1
        return res
            
        