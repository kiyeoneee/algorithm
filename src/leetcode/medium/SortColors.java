package leetcode.medium;

public class SortColors {
    // url : https://leetcode.com/problems/sort-colors/

    // TODO: 2020/08/09 안 보고 한번 더 풀어보기 
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

    public void sortColors2(int[] nums) {
        int start = 0, end = nums.length - 1, index = 0;

        while(index <= end && start < end) {
            if (nums[index] == 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                ++start;
                ++index;
            } else if (nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                --end;
            } else {
                ++index;
            }
        }
    }
}
