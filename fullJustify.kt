// Given an array of strings words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
// You should pack your words in a greedy approach; that is, pack as many words as you can in each line.
// Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
// Extra spaces between words should be distributed as evenly as possible.
// If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
// For the last line of text, it should be left-justified, and no extra space is inserted between words.

fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
    val result = mutableListOf<String>()
    var lineStart = 0

    while (lineStart < words.size) {
        var lineEnd = lineStart
        var lineSum = words[lineStart].length

        while (lineEnd + 1 < words.size && lineSum + 1 + words[lineEnd + 1].length <= maxWidth) {
            lineEnd++
            lineSum += 1 + words[lineEnd].length
        }

        val line = StringBuilder(words[lineStart])
        val numWords = lineEnd - lineStart

        if (lineEnd != lineStart && lineEnd != words.size - 1) {
            val totalSpaces = maxWidth - lineSum + numWords
            val spacesBetweenWords = totalSpaces / numWords
            val extraSpaces = totalSpaces % numWords

            for (i in 1..numWords) {
                repeat(spacesBetweenWords) { line.append(' ') }
                if (i <= extraSpaces) line.append(' ')
                line.append(words[lineStart + i])
            }
        } else {
            for (i in lineStart + 1..lineEnd) {
                line.append(' ')
                line.append(words[i])
            }
            val remainingSpaces = maxWidth - line.length
            repeat(remainingSpaces) { line.append(' ') }
        }

        result.add(line.toString())
        lineStart = lineEnd + 1
    }

    return result
}

fun main() {
    val words = arrayOf("This", "is", "an", "example", "of", "text", "justification.")
    val maxWidth = 16
    val justifiedText = fullJustify(words, maxWidth)
    justifiedText.forEach { println(it) }
}
