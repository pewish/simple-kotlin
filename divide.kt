class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
        if (dividend == Int.MIN_VALUE && divisor == -1) {
            return Int.MAX_VALUE
        }
        
        val sign = if ((dividend < 0) xor (divisor < 0)) -1 else 1
        var dvd = Math.abs(dividend.toLong())
        val dvs = Math.abs(divisor.toLong())
        
        var quotient = 0L
        for (i in 31 downTo 0) {
            if (dvd shr i >= dvs) {
                quotient += 1L shl i
                dvd -= dvs shl i
            }
        }
        
        return (sign * quotient).toInt()
    }

}
