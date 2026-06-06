class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort()
        i = 0
        j = len(nums) - 1
        max1 = 0
        while i < j:
            max1 = max(max1,nums[i]+nums[j]) 
            i+=1
            j-=1

        return max1