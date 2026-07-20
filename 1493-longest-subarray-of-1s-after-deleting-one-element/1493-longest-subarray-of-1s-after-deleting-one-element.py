class Solution(object):
    def longestSubarray(self, nums):
        left = 0
        ans = 0
        zeroes = 0
        for r in range(len(nums)):
            if nums[r] == 0:
                zeroes += 1
            while zeroes > 1:
                if nums[left] == 0:
                    zeroes -= 1
                left += 1
            ans = max(ans,r - left)
        return ans
        