//Fill the array with random integers. Find elements with maximum and minimum value using array functions min() and max().

import kotlin.random.Random

fun main() {
    val array = IntArray(10) { Random.nextInt(100) }
    
    val minElement = array.minOrNull()
    val maxElement = array.maxOrNull()
    
    println("Массив: ${array.joinToString()}")
    println("Минимальный элемент: $minElement")
    println("Максимальный элемент: $maxElement")
}
