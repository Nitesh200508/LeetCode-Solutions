class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = n * n;
        int b = n * (n+1);
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}