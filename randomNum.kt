// Write a program that generates a random number between -5 and 5 inclusive.
// If this number is negative, then -1 is displayed on the screen; if positive, 1 is output, if equal to zero, 0 is output.

import kotlin.random.Random

fun randomNum() {
    val num = Random.nextInt(from = -5, until = 5)
    if (num < 0)
        println(-1)
    else if (num > 0)
        println(1)
    else
        println(0)
}

fun main() {
    val a = randomNum()
}
