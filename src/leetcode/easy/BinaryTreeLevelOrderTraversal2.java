package leetcode.easy;

import java.util.*;

public class BinaryTreeLevelOrderTraversal2 {
    // url : https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> tree = new LinkedList<>();
        tree.add(root);

        while(!tree.isEmpty()) {
            int size = tree.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = tree.remove();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    tree.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    tree.add(currentNode.right);
                }
            }

            result.add(currentLevel);
        }

        Collections.reverse(result);
        return result;
    }
}
