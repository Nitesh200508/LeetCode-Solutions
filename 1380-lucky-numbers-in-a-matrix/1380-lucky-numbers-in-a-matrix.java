class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        int n = matrix.length;
        int ans = -1;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    ans = j;
                }
            }
            for (int x = 0; x < n; x++) {
                if (matrix[x][ans] > max) {
                    max = matrix[x][ans];
                }
            }
            if (min == max) {
                ls.add(max);
            }
        }
        return ls;
    }
}