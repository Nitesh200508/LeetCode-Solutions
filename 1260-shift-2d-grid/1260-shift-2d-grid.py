class Solution(object):
    def shiftGrid(self, grid, k):
        n = len(grid)
        m = len(grid[0])
        k %= (n * m)
        arr = [[0] * m for i in range(n)]
        for i in range(n):
            for j in range(m):
                pos = (i * m + j + k) % ( n * m)
                nr = pos // m
                nc = pos % m
                arr[nr][nc] = grid[i][j]
        return arr