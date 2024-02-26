package backtracking;

import java.util.HashSet;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/generate-parentheses/description/">22</a>
 * <p>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2:
 * <p>
 * Input: n = 1
 * Output: ["()"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 8
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        HashSet<String> res = new HashSet<>();
        backTrack(res, new StringBuilder(), 0, 0, n);
        return res.stream().toList();
    }

    private static void backTrack(HashSet<String> res, StringBuilder current, int open, int close, int max) {

        if (open == max && close == max) {
            res.add(current.toString());
        }

        if (open < max) {
            backTrack(res, current.append("("), open + 1, close, max);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            backTrack(res, current.append(")"), open, close + 1, max);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
