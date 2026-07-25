class Solution {
    public int maxProduct(int n) {
        int max = 0;
        while(n > 0){
            int r = n%10;
            n = n/10;
            int k = n;
            while(k > 0){
                int m = k % 10;
                max = Math.max(max,m * r);
                k = k/10;
            }
        }
        return max;
    }
}