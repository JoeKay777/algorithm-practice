package pratice1.Week_01;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 26. 删除有序数组中的重复项
 */
public class solution01 {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int len = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[len]) {
                len++;
                nums[len] = nums[i];
            }

        }
        return len+1;
    }
}
