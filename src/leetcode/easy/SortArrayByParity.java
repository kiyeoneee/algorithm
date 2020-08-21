package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
    // url : https://leetcode.com/problems/sort-array-by-parity/

    public int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i : A) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        even.addAll(odd);
        return even.stream().mapToInt(Integer::intValue).toArray();
    }
}
