package Practice

fun <T,R> Collection<T>.fold(initial: R, combine: (acc: R, nextElement: T) -> R): R{
    var accumulator: R = initial
    for (element: T in this){
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

fun main(args: Array<String>){
    val items = listOf(1,2,3,4,5)
    items.fold(0, {acc: Int, i:Int ->
        print("acc = $acc,  i = $i, ")
        val result = acc + i
        print("result = $result ")
        result
    })
    val joiningToString = items.fold("Elements:", {acc, i -> acc + "  " + i})
    val product = items.fold(1,Int::times)
    println(joiningToString)
    println(product)

}