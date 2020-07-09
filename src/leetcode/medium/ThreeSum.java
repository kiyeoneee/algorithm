package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    // url : https://leetcode.com/problems/3sum/

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        Arrays.sort(nums);
        int numSize = nums.length;
        for (int i = 0; i < numSize - 2; i++) {
            if (i > 0 && nums[i] > 0)
                break;

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1, k = numSize - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] > 0) {
                    --k;
                }
                else if (nums[i] + nums[j] + nums[k] == 0) {
                    results.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while(j < k && nums[j] == nums[j + 1]) ++j;
                    while(j < k && nums[k] == nums[k - 1]) --k;
                    ++j; --k;
                } else {
                    ++j;
                }
            }
        }

        return results;
    }
}
