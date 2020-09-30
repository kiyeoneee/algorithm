package leetcode.medium;

import leetcode.common.TreeNode;

public class KthSmallestElementInABst {
    /*
     * url : https://leetcode.com/problems/kth-smallest-element-in-a-bst/
     *
     * Binary Search Tree
     *
     *
     * Runtime : faster than 100.00% of Java online submissions
     * Memory Usage : less than 95.34% of Java online submissions
     * Time complexity : O(n)
     * Space complexity : O(n)
     */
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k, 0);

        return result;
    }

    private int helper(TreeNode root, int k, int idx) {
        if (root == null) {
            return idx;
        }

        int cnt = helper(root.left, k, idx);

        if (++cnt == k) {
            result = root.val;
            return cnt;
        }

        return helper(root.right, k, cnt);
    }
}
