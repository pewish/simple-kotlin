// Write a program that asks for two numbers as input, an operation sign (+, -, * or /) and performs the specified operation on the numbers.
// To cast a string type to a numeric type, use the string functions toInt() or toDouble() and the like.
// Improve the program by allowing the user to perform arithmetic calculations until he enters the word "stop" instead of the first number.

fun main() {
    var continueCalculating = true

    while (continueCalculating) {
        println("Введите первое число или 'stop', чтобы завершить программу:")
        val input = readLine()
        if (input == "stop") {
            println("Программа завершена.")
            break
        }

        val number1 = input?.toDoubleOrNull()
        if (number1 == null) {
            println("Ошибка: Неправильный формат числа или введено 'stop'!")
            continue
        }

        println("Введите второе число:")
        val number2 = readLine()?.toDoubleOrNull()
        if (number2 == null) {
            println("Ошибка: Неправильный формат числа!")
            continue
        }

        println("Введите знак операции (+, -, * или /):")
        val operator = readLine()
        if (operator !in setOf("+", "-", "*", "/")) {
            println("Ошибка: Неправильный знак операции!")
            continue
        }

        val result = when (operator) {
            "+" -> number1 + number2
            "-" -> number1 - number2
            "*" -> number1 * number2
            "/" -> {
                if (number2 == 0.0) {
                    println("Ошибка: Деление на ноль!")
                    continue
                }
                number1 / number2
            }
            else -> 0.0 // Недостижимый случай
        }

        println("Результат операции: $result")
    }
}
