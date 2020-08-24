package leetcode.easy;


public class RotateArray {
    // url : https://leetcode.com/problems/rotate-array/

    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] result = new int[nums.length];

        for (int i = 0; i < size; i++) {
            result[(i + k) % size] = nums[i];
        }

        for (int i = 0; i < size; i++) {
            nums[i] = result[i];
        }
    }
}
