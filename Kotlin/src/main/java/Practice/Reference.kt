package Practice

fun isOdd(x: Int) = x % 2 != 0
fun main(args: Array<String>){
    val numbers = listOf(1,2,3,4)
    println(numbers.filter(::isOdd))
}
