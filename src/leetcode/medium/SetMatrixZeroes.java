package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    // url : https://leetcode.com/problems/set-matrix-zeroes/

    private Set<Integer> zeroRow = new HashSet<>();
    private Set<Integer> zeroCol = new HashSet<>();

    public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow.add(i);
                    zeroCol.add(j);
                }
            }

            if (zeroRow.contains(i)) {
                setRowZero(i, matrix);
            }
        }

        zeroCol.forEach(cIdx -> setColZero(cIdx, matrix));
    }

    private void setRowZero(int rIdx, int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[rIdx][i] = 0;
        }
    }

    private void setColZero(int cIdx, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][cIdx] = 0;
        }
    }
}
