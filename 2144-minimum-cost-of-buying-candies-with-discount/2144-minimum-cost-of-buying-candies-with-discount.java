class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int j = cost.length - 1;
        int ans = 0;
        while(j > 0){
            for(int i = 0;i < 2;i++){
                ans += cost[j];
                j--;
            }
            j--;
        }
        if(j==0)ans+=cost[j];
        return ans;
    }
}