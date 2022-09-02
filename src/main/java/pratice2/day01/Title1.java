package pratice2.day01;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/two-sum/
 * 1. 两数之和
 *
 * @author Joe
 */
public class Title1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> twoMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer index = twoMap.get(nums[i]);
            if (index != null) {
                return new int[] {i, index};
            }
            twoMap.put(target - nums[i], i);
        }
        return null;
    }
}
