class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        import heapq
        max_heap = []

        for num in arr:
            heapq.heappush(max_heap,(-abs(num - x),-num))
            if len(max_heap) > k:
                heapq.heappop(max_heap)

        result = sorted([-num for _,num in max_heap])
        return result