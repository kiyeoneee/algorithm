package leetcode.medium;

public class PathSumIII {
    // url : https://leetcode.com/problems/path-sum-iii/

    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;

        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int helper(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        return (node.val == sum ? 1 : 0) +
                helper(node.left, sum - node.val) +
                helper(node.right, sum - node.val);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
