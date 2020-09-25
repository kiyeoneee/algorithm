package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    // TODO: 2020/09/25 swap 방법으로 한번 더 풀어보길

    /**
     * url : https://leetcode.com/problems/permutations/
     *
     * BFS
     * 조합 문제
     * 그런데... list를 매번 새로 만들기 때문에 메모리 누수 포인트일 것 같은데...?
     *
     * Time complexity : O(n^n)
     * Space complexity : O(n^n)
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        boolean[] isVisited = new boolean[nums.length];
        permute(nums, new ArrayList<>(), result, isVisited);

        return result;
    }

    public void permute(int[] nums, List<Integer> before, List<List<Integer>> result, boolean[] isVisited) {
        if (before.size() == nums.length) {
            result.add(before);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (isVisited[i])
                continue;

            List<Integer> tmp = new ArrayList<>(before);
            tmp.add(nums[i]);
            isVisited[i] = true;
            permute(nums, tmp, result, isVisited);
            isVisited[i] = false;
        }
    }
}
