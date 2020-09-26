package leetcode.medium;

public class DailyTemperatures {

    /**
     * url : https://leetcode.com/problems/daily-temperatures/
     *
     * BruteForce
     * 가장 쉬운 방법으로 풀었을 때 (결과는 처참)
     * Runtime : faster than 6.22% of Java online submissions
     * Memory Usage : less than 75.51% of Java online submissions
     * Time complexity : O(n^2)
     * Space complexity : O(1)
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
}
