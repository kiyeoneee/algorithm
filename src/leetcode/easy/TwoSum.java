package leetcode.easy;

public class TwoSum {
    // url : https://leetcode.com/problems/two-sum
    // TODO: 2020/09/10 BruteForce 방식이 아닌 방법으로 풀어보

    /**
     * Brute force
     * Sorting이 불가능 한 경우이니 Two Pointer 방식으로 풀 수 없음
     * 가장 단순하게 Brute Force로 해결
     *
     * Time complexity : O(n^2)
     * Space complexity : O(1)
     */
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[2];
    }
}
