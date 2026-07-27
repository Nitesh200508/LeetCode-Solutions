class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        heap = []
        for i in range(len(nums)):
            heap.append(nums[i])
        import heapq
        heapq.heapify(heap)

        n1,n2 = heapq.nlargest(2,heap)
        return (n1-1)*(n2-1)