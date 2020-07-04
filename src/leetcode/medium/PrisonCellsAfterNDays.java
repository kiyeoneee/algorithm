package leetcode.medium;

import java.util.Arrays;

public class PrisonCellsAfterNDays {
    // url : https://leetcode.com/problems/prison-cells-after-n-days/

    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] initialCells = new int[8];

        for (int i = 1 ; i < 7; i++) {
            initialCells[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
        }
        initialCells[0] = initialCells[7] = 0;
        --N;

        for (int i = 0; i < 8; i++)
            cells[i] = initialCells[i];

        int cnt = 1;
        while (N-- > 0) {
            int[] tmp = new int[8];

            for (int i = 1; i < 7; i++) {
                tmp[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
            }

            if (Arrays.equals(tmp, initialCells)) {
                N %= cnt;
            }

            cells = tmp;
            ++cnt;
        }

        return cells;
    }
}
