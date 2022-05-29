package Practice

/**
 * Type conversion - one data type variable converted to another data type.
 * implicit conversion is not supported
 *
 *
 *
 *
 * */

fun main(args: Array<String>){
    var number1 = 10
  //  var number2: Long = number1 // Compile error . Kotlin does not support implicit conversion
    //To support implicit conversion, Kotlin provides helper function.
    //Implicit conversion
    var number3: Int = 59
    var number4: Float = number3.toFloat()

    // Explicit conversion
    var number5: Double = 59.67
    var number6: Int = number5.toInt()

}