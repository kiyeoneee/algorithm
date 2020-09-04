package leetcode.easy;

import java.util.*;

public class RelativeSortArray {
    // url : https://leetcode.com/problems/relative-sort-array/

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int i : arr1) {
            if (count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            } else {
                count.put(i, 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        int index = 0;
        for (int i : arr2) {
            int cnt = count.get(i);
            for (int j = 0; j < cnt; j++) {
                result.add(i);
            }
            count.remove(i);
        }

        List<Integer> subResult = new ArrayList<>();
        for (int i : count.keySet()) {
            int cnt = count.get(i);
            for (int j = 0; j < cnt; j++) {
                subResult.add(i);
            }
        }
        Collections.sort(subResult);

        result.addAll(subResult);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
