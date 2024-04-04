// Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
// Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

import java.util.ArrayDeque

class Solution {

    fun calculate(s: String): Int {
        val stack = ArrayDeque<Int>()
        var result = 0
        var num = 0
        var sign = 1

        for (char in s) {
            when (char) {
                '+' -> {
                    result += sign * num
                    num = 0
                    sign = 1
                }
                '-' -> {
                    result += sign * num
                    num = 0
                    sign = -1
                }
                '(' -> {
                    stack.push(result)
                    stack.push(sign)
                    result = 0
                    sign = 1
                }
                ')' -> {
                    result += sign * num
                    num = 0
                    result *= stack.pop()
                    result += stack.pop()
                }
                in '0'..'9' -> {
                    num = num * 10 + (char - '0')
                }
            }
        }

        return result + sign * num
    }

    fun main() {
        val s = "1 + 2"
        println(calculate(s)) // Output: 3
    }

}
