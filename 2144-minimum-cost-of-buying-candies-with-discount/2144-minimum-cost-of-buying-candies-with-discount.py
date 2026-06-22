class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        cost.sort()
        j = len(cost) - 1
        ans = 0
        while(j > 0):
            for i in range(2):
                ans += cost[j]
                j-=1
            
            j-=1
        
        if j==0:
            ans+=cost[j]
        return ans