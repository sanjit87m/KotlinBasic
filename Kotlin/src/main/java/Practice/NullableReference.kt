package Practice

/**
 * Can't assign a NULL value by default
 * nullable
 * "?" beside the datatype of the reference
 *
 *
 * */
fun main(args: Array<String>){
    var nullableReference: String? = "I can take null"
    println(nullableReference)
    nullableReference = null
    println(nullableReference)


}