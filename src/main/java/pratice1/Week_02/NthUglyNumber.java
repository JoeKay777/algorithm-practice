package pratice1.Week_02;

/**
 * https://leetcode.cn/problems/ugly-number-ii/
 * 264. 丑数 II
 * @author Joe
 *
 */
public class NthUglyNumber {

	// 动态规划
	public int nthUglyNumber(int n) {
		int[] uglyNum = new int[n];
		uglyNum[0] = 1;
		int p2 = 0,p3 = 0, p5 = 0;
		int i = 1;
		while (i < n) {
			uglyNum[i] = Math.min(Math.min(uglyNum[p2] * 2, uglyNum[p3] * 3), uglyNum[p5] * 5);
			if(uglyNum[i] % 2 == 0) p2++;
			if(uglyNum[i] % 3 == 0) p3++;
			if(uglyNum[i] % 5 == 0) p5++;
			i++;
		}
		
		return uglyNum[n-1];
	}
}

