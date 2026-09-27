class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int dp[][] = new int[m][n];
        for(int row[] :dp) {
            Arrays.fill(row,-1);
        }
        return countPaths(m-1,n-1,obstacleGrid,dp);
    }
    private int countPaths(int m,int n,int[][] grid,int[][] dp) {
        if(m<0 || n<0 || grid[m][n] == 1) {
            return 0;
        }
        if(m == 0 && n==0) {
            return 1;
        }
        if(dp[m][n] != -1) {
            return dp[m][n];
        }
        dp[m][n] = countPaths(m-1,n,grid,dp) + countPaths(m,n-1,grid,dp);
        return dp[m][n];
    }
}