package leetcode.easy;

public class MoveZeroes {
    // url : https://leetcode.com/problems/move-zeroes/

    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int j = 0;

        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < size) {
            nums[j++] = 0;
        }
    }
}
