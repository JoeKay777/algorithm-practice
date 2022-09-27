package pratice2.day02;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * https://leetcode.cn/problems/generate-parentheses/
 *
 * @author qkh
 */
public class Title22 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        _generate(result, "", n, n);
        return result;
    }

    private void _generate(List<String> result, String str, int left, int right) {
        // 满足条件
        if (left == 0 && right == 0) {
            result.add(str);
        }
        // 列表选择
        if (left > 0) {
            _generate(result, str + "(", left - 1, right);
        }
        if (right > left) {
            _generate(result, str + ")", left, right - 1);
        }
    }
}
