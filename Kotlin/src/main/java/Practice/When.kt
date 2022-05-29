package Practice

/**
 * Replacement of Java switch statement
 * Evaluate a section of code
 * Beak not required
 * When as expression
 *
 *
 *
 * */

fun main(){
    var number1 = 3
    when(number1){
        1 -> println("This is one")
        2 -> println("This is two")
        else -> {
            println("Invalid entry")
            println("Enter valid number")
        }
    }
    var message = when(number1){
        1 -> "This is one"
        2 -> "This is two"
        else -> "Invalid entry"
    }
    println("Message is $message")
}