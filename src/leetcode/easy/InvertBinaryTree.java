package leetcode.easy;

public class InvertBinaryTree {
    // url : https://leetcode.com/problems/invert-binary-tree/

    /**
     * Recursive
     * 가장 기본적인 Recursive 문제
     * 다시 풀어본다면 memory를 어떻게해야 더 효율적일 지 생각해보자
     *
     * Time complexity : O(n)
     * Space complexity : O(n)
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
