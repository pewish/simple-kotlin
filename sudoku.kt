// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

class Solution {
    
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val seen = HashSet<String>()

        for (i in board.indices) {
            for (j in board[i].indices) {
                val num = board[i][j]
                if (num != '.') {
                    if (!seen.add("$num in row $i") ||
                        !seen.add("$num in column $j") ||
                        !seen.add("$num in sub-box ${i / 3}-${j / 3}")
                    ) {
                        return false
                    }
                }
            }
        }

        return true
    }

}
