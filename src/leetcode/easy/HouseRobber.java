package leetcode.easy;

public class HouseRobber {
    // url : https://leetcode.com/problems/house-robber
    // TODO: 2020/09/15 한번 더 풀어보기 

    /**
     * Dynamic Programming
     * 처음에는 brute force 방식으로 풀었으나 time limit이 떠서 솔루선 참고
     *
     * Time complexity : O(n)
     * Space complexity : O(1)
     */
    public int rob(int[] nums) {
        int add = 0, unAdd = 0, max = 0;

        for (int i : nums) {
            max = Math.max(add + i, unAdd);
            add = unAdd;
            unAdd = max;
        }

        return max;
    }
}
