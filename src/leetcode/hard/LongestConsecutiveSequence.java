package leetcode.hard;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    // TODO: 2020-09-19 O(n) 의 방법으로 다시 풀어볼 것 
    /**
     * url : https://leetcode.com/problems/longest-consecutive-sequence/
     *
     * Array, Union Find
     * 주어진 배열에서 연속된 숫자의 최대 길이를 구하는 문제
     * 문제에서는 O(n)으로 풀라고 해서 Binary Tree 로 풀어보려 했는데 이 경우에도 O(n)이 아닌 O(nlogn) 이 됨
     * 하지만 이 경우 Tree를 직접 구현해야 해야 함
     * 그럴바엔 Array 를 Sorting 한 후 순차적으로 조회하는 방법이 더 효율적 
     *
     * Time complexity : O(nlogn)
     * Space complexity : O(n)
     */
    
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        Arrays.sort(nums);
        int max = 0, len = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                ++len;
            } else if (nums[i] > nums[i - 1] + 1) {
                max = max > len ? max : len;
                len = 1;
            }
        }

        return max > len ? max : len;
    }
}
