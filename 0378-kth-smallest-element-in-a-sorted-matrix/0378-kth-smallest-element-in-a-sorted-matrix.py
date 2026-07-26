class Solution:
    def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
        n = len(matrix)

        heap = []

        for i in range(n):
            heap.append((matrix[i][0],i,0))
        
        import heapq
        heapq.heapify(heap)

        for _ in range(k-1):
            val,row,col = heapq.heappop(heap)

            if col + 1 < n:
                next_val = matrix[row][col + 1]
                heapq.heappush(heap,(next_val,row,col + 1))

        return heapq.heappop(heap)[0]