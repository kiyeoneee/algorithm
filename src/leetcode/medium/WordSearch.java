package leetcode.medium;

public class WordSearch {
    // url : https://leetcode.com/problems/word-search/

    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];

        int strIndex = 0;
        boolean isExist = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(strIndex)) {
                    isExist = findWord(board, i, j, strIndex, word);
                    if (isExist)
                        return true;
                }
            }
        }

        return false;
    }

    private boolean findWord(char[][] board, int row, int col, int strIdx, String word) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col]) {
            return false;
        }
        if (strIdx == (word.length() - 1)) {

            return word.charAt(strIdx) == board[row][col];
        }
        if (board[row][col] != word.charAt(strIdx)) {
            return false;
        }

        visited[row][col] = true;

        if (findWord(board, row, col + 1, strIdx + 1, word) ||
                findWord(board, row + 1, col, strIdx + 1, word) ||
                findWord(board, row, col - 1, strIdx + 1, word) ||
                findWord(board, row - 1, col, strIdx + 1, word))
            return true;

        visited[row][col] = false;
        return false;

    }
}
