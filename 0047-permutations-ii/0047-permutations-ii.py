class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        used = [False] * len(nums)
        res = []
        def dfs(path):
            if len(path) == len(nums):
                if path not in res:
                    res.append(path[:])
                return 
            for i in range(len(nums)):
                if used[i]:
                    continue
                used[i] = True
                path.append(nums[i])
                dfs(path)
                path.pop()
                used[i] = False
                

        dfs([])
        return res