class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        l = 1
        r = num
        
        if num == 1:
            return True


        while l < r:
            mid = l + (r-l)//2

            if mid * mid == num:
                return True

            if mid * mid < num:
                l = mid + 1
            else:
                r = mid

        return False