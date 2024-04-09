// Write a program to solve a Sudoku puzzle by filling the empty cells.

// A sudoku solution must satisfy all of the following rules:

// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
// The '.' character indicates empty cells.

class Solution {
    fun solveSudoku(board: Array<CharArray>) {
        solve(board)
    }
    
    private fun solve(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            for (j in 0 until 9) {
                if (board[i][j] == '.') {
                    for (num in '1'..'9') {
                        if (isValid(board, i, j, num)) {
                            board[i][j] = num
                            if (solve(board)) return true
                            board[i][j] = '.'
                        }
                    }
                    return false
                }
            }
        }
        return true
    }
    
    private fun isValid(board: Array<CharArray>, row: Int, col: Int, num: Char): Boolean {
        for (i in 0 until 9) {
            if (board[row][i] == num) return false
            if (board[i][col] == num) return false
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) return false
        }
        return true
    }
}
