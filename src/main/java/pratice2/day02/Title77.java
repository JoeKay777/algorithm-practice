package pratice2.day02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 77. 组合
 * https://leetcode.cn/problems/combinations/
 * 回溯算法模板：
 * result = []
 * def backtrack(路径, 选择列表):
 *     if 满足结束条件:
 *         result.add(路径)
 *         return
 *     for 选择 in 选择列表:
 *         做选择
 *         backtrack(路径, 选择列表)
 *         撤销选择
 *
 */
public class Title77 {

    private List<List<Integer>> result = new ArrayList<>();

    private int k;
    private int n;
    public List<List<Integer>> combine(int n, int k) {
        this.k = k;
        this.n = n;
        backtrack(1, new LinkedList<>());
        return result;
    }

    private void backtrack(int first, LinkedList<Integer> checked) {
        // 满足条件返回结果
        if (checked.size() == k) {
            result.add(new ArrayList<>(checked));
            return;
        }
        // 继续选择
        for (int i = first; i <= n; i++) {
            // 剪枝
            if (checked.size() + n - first + 1 < k) {
                continue;
            }
            // 选择
            checked.add(i);
            // 回溯
            backtrack(i+1, checked);
            // 撤销选择
            checked.removeLast();
        }
    }
}
