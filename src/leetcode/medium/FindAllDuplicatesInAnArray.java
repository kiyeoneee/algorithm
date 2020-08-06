package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    // url : https://leetcode.com/problems/find-all-duplicates-in-an-array/

    public List<Integer> findDuplicates(int[] nums) {
        if (nums.length <= 1)
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 1; i < nums.length;) {
            if (nums[i - 1] == nums[i]) {
                result.add(nums[i]);

                while(++i < nums.length && nums[i - 1] == nums[i]);
            } else {
                ++i;
            }
        }

        return result;
    }
}
