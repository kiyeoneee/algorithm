package leetcode.medium;

public class RotateImage {
    // url : https://leetcode.com/problems/rotate-image/
    // TODO: 2020/09/13 메모리를 아끼는 방법을 생각해 볼 것!

    /**
     * 메모리를 써서 쉽게 해결하긴 했지만 메모리 측면에서 너무 비효율적인 알고리즘
     *
     * Time complexity : O(n^2)
     * Space complexity : O(n)
     */
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        int[][] tmp = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tmp[i][j] = matrix[i][j];
            }
        }

        for (int i = 0, col = 0; i < size; i++, col++) {
            for (int j = size - 1, row = 0; j >= 0; j--, row++) {
                matrix[col][row] = tmp[j][i];
            }
        }
    }
}
