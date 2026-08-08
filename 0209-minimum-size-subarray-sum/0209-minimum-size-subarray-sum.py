class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        n = len(nums)
        min_len = n + 1

        start = 0
        curr_sum = 0

        for end in range(n):
            curr_sum += nums[end]
            while curr_sum >= target:
                min_len = min(min_len,end - start + 1)
                curr_sum -= nums[start]
                start += 1

        return min_len if min_len != n + 1 else 0