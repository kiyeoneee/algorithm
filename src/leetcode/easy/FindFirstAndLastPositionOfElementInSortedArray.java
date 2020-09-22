package leetcode.easy;

public class FindFirstAndLastPositionOfElementInSortedArray {
    // url : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    // TODO: 2020/09/22 다시 풀면 리팩토링 버전으로 나올까?

    /**
     * Search (Liner Search)
     * 정렬 된 배열에서 target으로 주어진 값의 시작과 끝을 찾기
     *
     * Time complexity : O(n)
     * Space complexity : O(n)
     */
    public int[] searchRange(int[] nums, int target) {
        if (nums.length < 1) {
            return new int[]{-1, -1};
        }

        int[] result = {0, 0};
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                if (checkIsTarget(nums, result[0], result[1], target)) {
                    return result;
                }
                result[0] = i;
            }
            result[1] = i;
        }

        return checkIsTarget(nums, result[0], result[1], target) ? result : new int[]{-1, -1};
    }

    private boolean checkIsTarget(int[] nums, int start, int end, int target) {
        if (nums[start] == target && nums[end] == target) {
            return true;
        }

        return false;
    }
}
