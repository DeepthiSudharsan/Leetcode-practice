class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        cols = len(matrix[0])
        tmp = []
        for c in range(cols):
            if c != cols - 1:
                tmp.append(matrix[c][c+1:cols+1])
            matrix[c] = [matrix[j][c] for j in range(cols-1,-1,-1)]
            if c != 0:
                for i in range(c-1,-1,-1):
                    matrix[c][cols - 1 - i] = tmp[i][0]
                    tmp[i].pop(0)
                        
                    
                
        
                
        