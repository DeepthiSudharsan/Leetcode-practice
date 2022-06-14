class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        r,c = len(matrix), len(matrix[0])
        iz, jz = set(),set()
        for i in range(r):
            for j in range(c):
                if matrix[i][j] == 0:
                    iz.add(i)
                    jz.add(j)
        for i in iz:
            matrix[i] = [0] * c
        for j in jz:
            for k in range(r):
                matrix[k][j] = 0
                        
            
                    
        