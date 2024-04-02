// Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters.
// No two characters may map to the same character, but a character may map to itself.

fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val sToTMap = mutableMapOf<Char, Char>()
        val tToSMap = mutableMapOf<Char, Char>()

        for (i in s.indices) {
            val sChar = s[i]
            val tChar = t[i]

            if (sToTMap.containsKey(sChar)) {
                if (sToTMap[sChar] != tChar) return false
            } else {
                sToTMap[sChar] = tChar
            }

            if (tToSMap.containsKey(tChar)) {
                if (tToSMap[tChar] != sChar) return false
            } else {
                tToSMap[tChar] = sChar
            }
        }

        return true
    }
