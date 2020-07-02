package leetcode.easy;

public class BinarySearch {
    // url : https://leetcode.com/problems/binary-search/

    public int search(int[] nums, int target) {
        int sIdx = 0, eIdx = nums.length - 1, idx = (sIdx + eIdx)/2;

        while (sIdx <= eIdx) {
            if (nums[idx] == target) {
                return idx;
            } else if (nums[idx] < target) {
                sIdx = idx + 1;
            } else {
                eIdx = idx - 1;
            }

            idx = (sIdx + eIdx)/2;
        }

        return -1;
    }
}
