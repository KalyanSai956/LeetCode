class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int row[] : dp) {
            Arrays.fill(row,-1);
        }
        return countPaths(m-1,n-1,grid,dp);
    }
    private int countPaths(int m,int n,int[][] grid,int[][] dp) {
        if(m == 0 && n == 0) {
            return grid[0][0];
        }
        if(m<0 || n<0) {
            return Integer.MAX_VALUE;
        }
        if(dp[m][n] != -1) {
            return dp[m][n];
        }
        dp[m][n] = grid[m][n] + Math.min(countPaths(m-1,n,grid,dp),countPaths(m,n-1,grid,dp));
        return dp[m][n];
    }
}