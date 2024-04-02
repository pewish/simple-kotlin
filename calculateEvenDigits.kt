//The input is a string consisting of integers without spaces.
//It is necessary to find the sum of even numbers and implement the algorithm as a separate function.

fun calculateEvenDigits(input:String): Int{
    var cnt:Int = 0

    for (c in input) {
        val i:Int = Character.getNumericValue(c)
        if (i % 2 == 0) cnt += i
    }
    return cnt
}

fun main(args: Array<String>) {
    val a : String? = readLine()
    if(a!=null){
        print(calculateEvenDigits(a.toString()))
    }
}
