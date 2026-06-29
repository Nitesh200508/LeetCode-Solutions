class Solution:
    def Sort(self,arr):
        for i in range(1,len(arr)):
            key = arr[i]
            j = i - 1
            while j >= 0 and arr[j]>key:
                arr[j+1] = arr[j]
                j-=1
            
            arr[j+1] = key
        return arr
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        ind = []
        nums = self.Sort(nums)
        for i in range(len(nums)):
            if nums[i] == target:
                ind.append(i)
        return ind