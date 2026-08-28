class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;
        for (int k = l; k <= r; k++) {
            int i = 0;
            int j = 0;
            int sum = 0;
            while (j < n) {
                sum += nums.get(j);
                if (j - i + 1 < k) {
                    j++;
                }
                else if (j - i + 1 == k) {
                    if (sum > 0) {
                        ans = Math.min(ans, sum);
                    }
                    sum -= nums.get(i);
                    i++;
                    j++;
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}