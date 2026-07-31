class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        from collections import deque
        if amount == 0:
            return 0

        queue = deque()
        queue.append((0,0))

        visitedAmt = set()
        visitedAmt.add(0)

        while queue:
            currSum,noOfCoins = queue.popleft()

            for coin in coins:
                nextSum = currSum + coin

                if nextSum == amount:
                    return noOfCoins + 1

                if nextSum < amount and nextSum not in visitedAmt:
                    visitedAmt.add(nextSum)
                    queue.append((nextSum,noOfCoins + 1))

        return -1