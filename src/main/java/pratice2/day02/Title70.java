package pratice2.day02;

/**
 * 70. 爬楼梯
 * https://leetcode.cn/problems/climbing-stairs/
 *
 * @author qkh
 */
public class Title70 {
    /**
     * dp[i]表示 i阶梯有的方法数
     * dp[i] = dp[i-1] + dp[i-2]
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int p1 = 1, p2 = 2, p = n;
        while (n > 2) {
            p = p1 + p2;
            p1 = p2;
            p2 = p;
            n--;
        }
        return p;
    }
}
