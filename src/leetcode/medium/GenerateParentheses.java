package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private static final String LEFT_FORMAT = "(";
    private static final String RIGHT_FORMAT = ")";

    /*
     * url : https://leetcode.com/problems/generate-parentheses/
     *
     * BruteForce
     * 왼쪽 괄호가 오른쪽 괄호 보다 먼저 나와야 한다는 규칙을 사용
     *
     * Runtime : faster than 85.48% of Java online submissions
     * Memory Usage : less than 95.67% of Java online submissions
     * Time complexity : O(n^2)
     * Space complexity : O(w)
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        generateString(n, n, "", result);

        return result;
    }

    public void generateString(int left, int right, String paren, List<String> result) {
        if (left == 0) {
            StringBuffer sb = new StringBuffer();
            for (int i = right; i > 0; i--) {
                sb.append(RIGHT_FORMAT);
            }
            result.add(paren + sb.toString());

            return;
        }

        if (left > 0)
            generateString(left - 1, right, paren + LEFT_FORMAT, result);
        if (left < right)
            generateString(left, right - 1, paren + RIGHT_FORMAT, result);
    }
}
