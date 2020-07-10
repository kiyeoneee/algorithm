package leetcode.easy;

import java.util.Arrays;

public class SingleNumber {
    // url : https://leetcode.com/problems/single-number/

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        int cnt = 1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (cnt == 1 && nums[i] != nums[i - 1])
                return nums[i - 1];
            else if (nums[i] == nums[i - 1])
                cnt++;
            else if (cnt > 1 && nums[i] != nums[i - 1])
                cnt = 1;
        }

        return nums[nums.length - 1];
    }
}
