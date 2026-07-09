class Solution {
    private static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        int[] left = new int[n];
        int[] right = new int[n];

        int last = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') last = i;
            left[i] = last;
        }

        last = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') last = i;
            right[i] = last;
        }

        int m = 0;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) != '0') m++;

        int[] digit = new int[m + 1];
        int[] idx = new int[n];
        long[] preNum = new long[m + 1];
        int[] preSum = new int[m + 1];
        long[] pow10 = new long[m + 1];
        pow10[0] = 1;

        int p = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') {
                p++;
                idx[i] = p;
                digit[p] = s.charAt(i) - '0';
                preSum[p] = preSum[p - 1] + digit[p];
                pow10[p] = (pow10[p - 1] * 10) % MOD;
                preNum[p] = (preNum[p - 1] * 10 + digit[p]) % MOD;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];

            int first = right[l];
            if (first == -1 || first > r) {
                ans[i] = 0;
                continue;
            }

            int lastPos = left[r];
            int L = idx[first];
            int R = idx[lastPos];

            long num = (preNum[R] - preNum[L - 1] * pow10[R - L + 1]) % MOD;
            if (num < 0) num += MOD;

            long sum = preSum[R] - preSum[L - 1];
            ans[i] = (int) (num * sum % MOD);
        }

        return ans;
    }
}