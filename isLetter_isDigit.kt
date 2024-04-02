// Write a program that generates a random number between 32 and 122 inclusive.
// Then it converts the number into a symbol, and then checks whether it is a number, a letter, or anything else.
// Displays the appropriate message. The program should use such function methods as toChar(), isDigit() and isLetter().

import kotlin.random.Random

fun randomNumber() : String {
    val num = Random.nextInt(from = 32, until = 122)
    val char = num.toChar()
    val result = when {
        char.isDigit() -> "$char - это цифра"
        char.isLetter() -> "$char - это буква"
        else -> "это не цифра и не буква"
    }
    return result
}

fun main() {
    val result = randomNumber()
    println(result)
}
