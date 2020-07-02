package leetcode.dfsbfs;

public class BinaryTreeTilt {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // url : https://leetcode.com/problems/binary-tree-tilt
    int tilt = 0;
    public int findTilt(TreeNode root) {
        // tilt : |sum(왼쪽에 있는 전체 노드의 값) - sum(오른쪽에 있는 전체 노드의 값)| 들의 합
        setTilt(root);

        return tilt;
    }

    public int setTilt(TreeNode node) {
        if (node == null) return 0;

        int left = setTilt(node.left);
        int right = setTilt(node.right);

        tilt += (left > right ? left - right : right - left);

        return node.val + left + right;
    }
}
