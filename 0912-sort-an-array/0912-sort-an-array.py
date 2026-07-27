class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        import heapq
        heapq.heapify(nums)

        result = []
        while nums:
            result.append(heapq.heappop(nums))

        return result