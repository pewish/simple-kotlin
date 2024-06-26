// Given a string s, return the longest palindromic substring in s.

fun longestPalindrome(s: String): String {
    var start = 0
    var end = 0
    
    for (i in s.indices) {
        val len1 = expandAroundCenter(s, i, i)
        val len2 = expandAroundCenter(s, i, i + 1)
        val len = maxOf(len1, len2)
        
        if (len > end - start) {
            start = i - (len - 1) / 2
            end = i + len / 2
        }
    }
    
    return s.substring(start, end + 1)
}

fun expandAroundCenter(s: String, left: Int, right: Int): Int {
    var l = left
    var r = right
    
    while (l >= 0 && r < s.length && s[l] == s[r]) {
        l--
        r++
    }
    
    return r - l - 1
}

fun main() {
    val s = "babad"
    println(longestPalindrome(s))  // Output: "bab" or "aba"
}
