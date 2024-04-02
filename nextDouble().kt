//Using the Random object's nextDouble() function, write code that prints a random real number between 0 and 1, and a random real number between -2 and 2.
import kotlin.random.Random

fun main() {
    val randomNum1 : Double = Random.nextDouble(from = 0.0, until = 1.0)
    val randomNum2 : Double = Random.nextDouble(from = -.0, until = 2.0)
    println("First double number = " + randomNum1)
    println("Second double number = " + randomNum2)
}
