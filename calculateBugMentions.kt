fun calculateBugMentions(input:List<String>): Int{
    var cnt: Int = 0
    for (bug: String in input) {
        if (bug == "BUG")
            cnt++
    }
    return(cnt)
}

fun main() {
    val stroke: List<String> = readln()!!.split(" ")
    val calculate = calculateBugMentions(stroke)
    println(calculate)
}
