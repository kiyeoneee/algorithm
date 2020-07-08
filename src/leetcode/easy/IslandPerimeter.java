package leetcode.medium;

public class IslandPerimeter {
    // url : https://leetcode.com/problems/island-perimeter/

    public int islandPerimeter(int[][] grid) {
        int land = 0;
        int connected = 0;

        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    land++;
                    if (i < row - 1 && grid[i + 1][j] == 1) {
                        connected++;
                    }
                    if (j < col - 1 && grid[i][j + 1] == 1) {
                        connected++;
                    }
                }
            }
        }

        return land * 4 - connected * 2;
    }
}
