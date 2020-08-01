package leetcode.easy;

public class RemoveDuplicatesFromSortedArray {
    // url : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                ++j;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }
}
