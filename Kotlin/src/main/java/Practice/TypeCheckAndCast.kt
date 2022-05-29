package Practice

/**
 *        Type Checks
 *
 *        is operator - property is of certain type
 * val x: Any = "Ram"
 * if(x is String)
 *  println("Type is String")
 *
 *  !is operator - is not of certain type
 *   val x: Any = 123
 *   if(x !is String)
 *      println("Type is not String")
 *
 *   Smart cast
 *   Automatically casts a property to the desired type
 *      fun demo(x: Any){
 *         if(x is String){
 *             print(x.length)
 *            }
 *
 *
 *    Explicit casting
 *    1. Unsafe cast operator : as
 *        - explicitly cast a variable to target type
 *    2. Safe cast operator: as?
 *        - return null
 *
 *
 * */

fun main(args: Array<String>){
    var x = 5
    var y = x as? String
    println(y)
}
fun demo(x: Any){
    if(x is String){
        print(x.length)
    }
}