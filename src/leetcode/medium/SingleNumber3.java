package leetcode.medium;

import java.util.*;

public class SingleNumber3 {
    // url : https://leetcode.com/problems/single-number-iii/

    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.stream().mapToInt(Number::intValue).toArray();
    }
}
