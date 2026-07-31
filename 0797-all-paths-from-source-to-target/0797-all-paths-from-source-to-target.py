class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        res = []
        path = []

        def dfs(node):
            path.append(node)

            if node == len(graph) - 1:
                res.append(list(path))
            else:
                for neighbour in graph[node]:
                    dfs(neighbour)
            path.pop()

        dfs(0)

        return res