class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []

        def backtrack(start,combination,total):
            if total == target:
                res.append(combination[:])
                return

            if total > target:
                return

            for i in range(start,len(candidates)):
                combination.append(candidates[i])

                backtrack(i,combination,total+candidates[i])
                combination.pop()

                





        backtrack(0,[],0)
        return res  