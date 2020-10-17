package leetcode.medium;

import java.util.Arrays;

public class KthLargestElementInAnArray {
    /*
     * url : https://leetcode.com/problems/kth-largest-element-in-an-array/
     * k 번째로 큰 숫자, 그것도 distinct 가 아닌...?
     * sorting 한 후 index 로만 확인 해주면 되기에 문제가 너무 쉽다고 생각 되었다.
     *
     * Runtime : faster than 71.48% of Java online submissions
     * Memory Usage : less than 6.51% of Java online submissions
     * Time complexity : O(nlogn) - Arrays.sort 는 primitive 타입에 대해 quick sort 를 사용 ( worst O(n^2) )
     * Space complexity : O(1)
     */
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        return nums[nums.length - k];
    }
}
