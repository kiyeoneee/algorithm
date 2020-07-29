package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    // url : https://leetcode.com/problems/remove-element/

    public int removeElement(int[] nums, int val) {
        List<Integer> result = new ArrayList<>();

        int idx = 0;
        for (int num : nums) {
            if (num != val) {
                result.add(num);
                nums[idx++] = num;
            }
        }

        return result.size();
    }
}
