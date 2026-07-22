class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int sum = 0;

        int[] rowMax = new int[n];
        int[] colMax = new int[m];

        for(int i = 0;i < n;i++){
            int max2 = 0;
            for(int j = 0;j < m;j++){
                max2 = Math.max(grid[i][j],max2);
            }
            rowMax[i] = max2;
        }

        for(int i = 0;i < m;i++){
            int max1 = 0; 
            for(int j = 0;j < n;j++){
                max1 = Math.max(grid[j][i],max1);
            }
            colMax[i] = max1;
        }
        
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                sum += Math.min(rowMax[i],colMax[j]) - grid[i][j];
            }
        }

        return sum;
    }
}