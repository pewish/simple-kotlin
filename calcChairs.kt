fun calcChairs (x:Int): Int {
    val y = x + x/2
    return(y)
}

fun main() {
    // Считываем количество пришельцев с помощью readLine() и преобразуем в Int
    val x = readln()?.toIntOrNull() ?: 0
    val chairs = calcChairs(x)
    println(chairs)
}
