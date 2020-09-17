package leetcode.easy;

import java.util.Arrays;

public class MajorityElement {
    // url : https://leetcode.com/problems/majority-element/

    /**
     * Sorting
     * 가장 코딩하기 쉬운 방법으로 구현
     * HashMap을 사용해서 구현하는 방법으로 추후에 구현해보면 좋을 듯
     *
     * Time complexity : O(nlogn)
     * Space complexity : O(1)
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
