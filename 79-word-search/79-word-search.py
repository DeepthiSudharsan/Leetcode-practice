class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        rows, cols = len(board), len(board[0])
        
        visited = [[False for _ in board[0]] for _ in board]
        def dfs(r, c, nextIndex):
            if nextIndex == len(word):
                return True
            
            if r < 0 or c < 0 or r > rows - 1 or c > cols - 1:
                return False
            
            if word[nextIndex] != board[r][c] or visited[r][c]:
                return False
            
            visited[r][c] = True
            
            result = dfs(r-1, c, nextIndex+1) or dfs(r, c-1, nextIndex+1) or dfs(r+1, c, nextIndex+1) or dfs(r, c+1, nextIndex+1)
            visited[r][c] = False
            return result
            
        
        for r in range(rows):
            for c in range(cols):
                if dfs(r, c, 0):
                    return True
        return False
        