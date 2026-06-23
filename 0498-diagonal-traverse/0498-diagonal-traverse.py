class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        if not mat:
            return []
        dis = {}
        row,col = len(mat),len(mat[0])
        for i in range(row):
            for j in range(col):
                k = i + j
                if k not in dis:
                    dis[k] = []
                dis[k].append(mat[i][j])
        res = []
        for i in range(row + col -1):
            if i % 2 == 0:
                j = len(dis[i]) - 1
                while j >= 0:
                    res.append(dis[i][j])
                    j -= 1
            else:
                for val in dis[i]:
                    res.append(val)
        return res


        


