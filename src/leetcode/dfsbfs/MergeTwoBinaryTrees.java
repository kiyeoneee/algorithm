package leetcode.dfsbfs;

public class MergeTwoBinaryTrees {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // url : https://leetcode.com/problems/merge-two-binary-trees/
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return sum(t1, t2);
    }

    public TreeNode sum(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return null;
        else if (t1 == null)
            return t2;
        else if (t2 == null)
            return t1;

        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = sum(t1.left, t2.left);
        node.right = sum(t1.right, t2.right);
        return node;
    }
}
