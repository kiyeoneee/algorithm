package leetcode.medium;

public class SortColors {
    // url : https://leetcode.com/problems/sort-colors/

    public void sortColors(int[] nums) {
        int tmp, len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1 ; j++) {
                if (nums[j] > nums[j + 1]) {
                    tmp = nums[j];
                    nums[j] = nums [j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
    }
}
