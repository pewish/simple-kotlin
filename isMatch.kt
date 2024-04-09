// Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:

// '?' Matches any single character.
// '*' Matches any sequence of characters (including the empty sequence).
// The matching should cover the entire input string (not partial).

fun isMatch(s: String, p: String): Boolean {
    val dp = Array(s.length + 1) { BooleanArray(p.length + 1) }
    dp[0][0] = true
    
    for (j in 1..p.length) {
        if (p[j - 1] == '*') {
            dp[0][j] = dp[0][j - 1]
        }
    }
    
    for (i in 1..s.length) {
        for (j in 1..p.length) {
            if (p[j - 1] == '*') {
                dp[i][j] = dp[i - 1][j] || dp[i][j - 1]
            } else if (p[j - 1] == '?' || s[i - 1] == p[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1]
            }
        }
    }
    
    return dp[s.length][p.length]
}
