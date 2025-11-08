class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] d : dp) Arrays.fill(d, -1);
        return yo(m-1, n-1, dp);
    }

    public int yo(int m, int n, int[][] dp){
        if(n == 0 && m == 0){
            dp[m][n] = 1;
             return 1;
        }
        if(n < 0 || m < 0){
            return 0;
        }
        if(dp[m][n] != -1) return dp[m][n];
        dp[m][n] = yo(m-1, n, dp) + yo(m, n-1, dp);
        return dp[m][n];
    }
}