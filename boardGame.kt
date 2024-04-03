// Given an m x n grid of characters board and a string word, return true if word exists in the grid.
// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring.
// The same letter cell may not be used more than once.

fun exist(board: Array<CharArray>, word: String): Boolean {
    val m = board.size
    val n = board[0].size
    val visited = Array(m) { BooleanArray(n) }

    fun dfs(i: Int, j: Int, k: Int): Boolean {
        if (k == word.length) return true
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || board[i][j] != word[k]) return false

        visited[i][j] = true
        val found = dfs(i + 1, j, k + 1) || dfs(i - 1, j, k + 1) || dfs(i, j + 1, k + 1) || dfs(i, j - 1, k + 1)
        visited[i][j] = false

        return found
    }

    for (i in 0 until m) {
        for (j in 0 until n) {
            if (board[i][j] == word[0] && dfs(i, j, 0)) return true
        }
    }

    return false
}
