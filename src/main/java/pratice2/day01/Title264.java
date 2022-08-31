package pratice2.day01;

/**
 * https://leetcode.cn/problems/ugly-number-ii/
 * 264. 丑数 II
 *
 * @author Joe
 */
public class Title264 {

    // 动态规划
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p1 = 1, p2 = 1, p3 = 1;
        for (int i = 2; i <= n; i++) {
            int num = Math.min(Math.min(dp[p1] * 2, dp[p2] * 3), dp[p3] * 5);
            if (num == dp[p1] * 2) p1++;
            if (num == dp[p2] * 3) p2++;
            if (num == dp[p3] * 5) p3++;
            dp[i] = num;
        }
        return dp[n];

    }
}

