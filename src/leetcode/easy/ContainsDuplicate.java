package leetcode.easy;

import java.util.Arrays;

public class ContainsDuplicate {
    // url : https://leetcode.com/problems/contains-duplicate/

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        int numsLastIndex = nums.length - 1;
        for (int i = 1; i <= numsLastIndex; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}
