class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key = lambda x:x[1])
        count = 0
        prev_last = float("-inf")

        for first,last in intervals:
            if first < prev_last:
                count+=1
            else:
                prev_last = last
        return count