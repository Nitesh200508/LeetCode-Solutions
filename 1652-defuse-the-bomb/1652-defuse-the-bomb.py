class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        n = len(code)

        res = [0] * n

        if k == 0:
            return res

        window_sum = 0

        start = 1 if k > 0 else n+k
        end = k if k > 0 else n - 1

        for i in range(start,end+1):
            window_sum += code[i % n]

        for i in range(n):
            res[i] = window_sum

            window_sum -= code[start % n]
            window_sum += code[(end + 1) % n]

            start += 1
            end += 1

        return res

