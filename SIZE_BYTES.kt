// Different data types take up different amounts of memory.
// Use the SIZE_BYTES property to display the size that is allocated for each instance of integer data types.

fun main() {
    println(Int.SIZE_BYTES)
    println(Short.SIZE_BYTES)
    println(Long.SIZE_BYTES)
    println(Byte.SIZE_BYTES)

    println(Double.SIZE_BYTES)
    println(Float.SIZE_BYTES)

    println(Char.SIZE_BYTES)
}
