package leetcode.medium;

public class ValidateBinarySearchTree {
    // url : https://leetcode.com/problems/validate-binary-search-tree/
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

    public boolean isValidBST(TreeNode root) {
        return checkBst(root, null, null);
    }

    public boolean checkBst(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.val <= min) || (max != null && node.val >= max))
            return false;

        if (!checkBst(node.right, node.val, max) || !checkBst(node.left, min, node.val))
            return false;

        return true;
    }
}
