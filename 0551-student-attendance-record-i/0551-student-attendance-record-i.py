class Solution:
    def checkRecord(self, s: str) -> bool:
        a = 0
        l = 0
        for ch in s:
            if ch == 'A':
                a += 1
                l = 0
            elif ch == 'L':
                l += 1
            else:
                l = 0

            if a >= 2 or l >= 3:
                return False
        return True
