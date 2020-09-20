package leetcode.easy;

public class MaximumSubarray {

    /**
     * url : https://leetcode.com/problems/longest-consecutive-sequence/
     *
     * Array, Kadane Algorithm
     * 동적 계획법에서 나온 최대 부분합 알고리즘인 Kadane 알고리즘을 이용해서 해결
     *
     *
     * Time complexity : O(n)
     * Space complexity : O(n)
     */

    public int maxSubArray(int[] nums) {
        int max = nums[0], tmp = nums[0], size = nums.length;

        for (int i = 1; i < size; i++) {
            if (tmp < 0) {
                tmp = nums[i];
            } else {
                tmp += nums[i];
            }
            max = Math.max(max, tmp);
        }

        return max;
    }
}
