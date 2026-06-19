class Solution:
    def reverse(self, x: int) -> int:
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        rev = 0
        if x > 0 and x < INT_MAX:
            rev = int(str(abs(x))[::-1])
            if rev > INT_MAX:
                return 0
        elif x < 0 and x > INT_MIN:
            rev = -int(str(abs(x))[::-1])
            if rev < INT_MIN:
                return 0
        return rev