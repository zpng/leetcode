/**
 * @(#)UniquePathsII.java, 四月 12, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author ldap
 */
public class UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    if (i == m - 1 && j == n - 1) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] =
                                (i == m - 1 ? 0 : dp[i + 1][j]) + (j == n - 1 ? 0 : dp[i][j + 1]);
                    }
                }
            }
        }
        return dp[0][0];
    }

    //Simple Solution O(n)空间复杂度 O(M*N)时间复杂度
    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int j = 0; j < width; j++) {
                if (row[j] == 1)
                    dp[j] = 0;
                else if (j > 0)
                    dp[j] += dp[j - 1];
            }
        }
        return dp[width - 1];
    }
}
