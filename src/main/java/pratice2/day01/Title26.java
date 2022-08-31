package pratice2.day01;

/**
 * 26. 删除有序数组中的重复项
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 * 注意审题：是升序数组
 * @author qkh
 * @version 1.0
 * @date 2022/8/24 13:36
 */
public class Title26 {

    public int removeDuplicates(int[] nums) {
        int len = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[len]) {
                len++;
                nums[len] = nums[i];
            }

        }
        return len + 1;
    }

}
