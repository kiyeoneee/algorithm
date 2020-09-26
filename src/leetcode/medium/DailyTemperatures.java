package leetcode.medium;

import java.util.Stack;

public class DailyTemperatures {
    // TODO: 2020/09/26 Brute force 이외의 방법은..?

    /**
     * url : https://leetcode.com/problems/daily-temperatures/
     *
     * BruteForce
     * 가장 쉬운 방법으로 풀었을 때 (결과는 처참)
     * Runtime : faster than 6.22% of Java online submissions
     * Memory Usage : less than 75.51% of Java online submissions
     * Time complexity : O(n^2)
     * Space complexity : O(w)
     */
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            for (int j = i + 1; j < T.length; j++) {
                if (T[i] < T[j]) {
                    result[i] = j - i;
                    break;
                }
            }
        }

        return result;
    }

    /**
     * Stack
     * 이걸 스택으로...? 서브 미션 보고 푼 방법
     *
     * Runtime : faster than 52.85% of Java online submissions
     * Memory Usage : less than 79.89% of Java online submissions
     * Time complexity : O(n^2)
     * Space complexity : O(w)
     */
    public int[] dailyTemperaturesStack(int[] T) {
        int[] result = new int[T.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T.length; i++) {
            while (!stack.empty() && T[stack.peek()] < T[i]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        return result;
    }
}
