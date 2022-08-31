package pratice1.Week_04;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 */
public class GenerateParenthesis {

    private List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack("", 0, 0, n);
        return result;
    }

    private void backtrack(String str, int left, int right, int n) {
        if(left == n && right == n) {
            result.add(str);
            return;
        }
        if(left < n) {
            backtrack(str+"(", left+1, right, n);
        }
        if(right > left) {
            backtrack(str+")", left, right + 1, n);
        }
    }
}
