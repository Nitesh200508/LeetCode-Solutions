class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        
        ans = []
        n = len(nums)
        a = min(nums)
        b = max(nums)
        
        for i in range(a+1,b):
            if i not in nums:
                ans.append(i)
            

        return ans