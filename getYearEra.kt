fun getYearEra(year: Int): String {
    val decade: String
    when (year) {
        in 1901..1969 -> decade="before"
        1970 -> decade="equals"
        in 1971..2000 -> decade="after XX century"
        in 2001..2100 -> decade="after XXI century"
        else -> decade="distant future"
    }
    return (decade)
}

fun main() {
    val year: Int = readln()?.toIntOrNull()?: 0
    val decade = getYearEra(year)
    println(decade)
}
