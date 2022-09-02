package pratice2.day01;

import java.util.*;

/**
 * https://leetcode.cn/problems/top-k-frequent-elements/
 * 347. 前 K 个高频元素
 * 
 * @author Joe
 *
 */
public class Title347 {

	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num : nums) {
			Integer count = countMap.getOrDefault(num, 0);
			countMap.put(num, ++count);
		}
		// 最小堆
		PriorityQueue<int[]> queue = new PriorityQueue<>((int[] m1, int[] m2) -> {
			return m1[1] - m2[1];
		});
		for (Map.Entry<Integer, Integer> countEntry : countMap.entrySet()) {
			if (queue.size() < k) {
				queue.add(new int[]{countEntry.getKey(), countEntry.getValue()});
			} else if (countEntry.getValue() > queue.peek()[1]){
				queue.poll();
				queue.add(new int[]{countEntry.getKey(), countEntry.getValue()});
			}
		}
		int[] result = new int[queue.size()];
		int i = 0;
		while (!queue.isEmpty()) {
			result[i++] = queue.poll()[0];
		}
		return result;
	}
}
