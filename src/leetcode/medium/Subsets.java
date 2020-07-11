package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    // url : https://leetcode.com/problems/subsets/

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        addSubsets(result, nums, new ArrayList<Integer>(), 0);

        return result;
    }

    public void addSubsets(List<List<Integer>> result, int[] nums, List<Integer> subset, int idx) {
        result.add(subset);

        for (int i = idx; i < nums.length; i++) {
            subset.add(nums[i]);
            addSubsets(result, nums, new ArrayList<>(subset), i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
