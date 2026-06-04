class Solution:
    def sumOfThree(self, num: int) -> List[int]:
        arr = []

        if num % 3 == 0:
            i = int(num / 3)
            j = int(i - 1)
            k = int(i + 1)
            arr.append(j)
            arr.append(i)
            arr.append(k)

        return arr