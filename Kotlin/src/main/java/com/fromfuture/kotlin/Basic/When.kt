package com.fromfuture.kotlin.Basic

/**
 * Conditional statement When
 * Replacement of Java switch statement
 * Evaluates a section of code
 * Break not required
 * When as expression
 */

fun main(args: Array<String>){
    var number1 = 3
    when(number1){
        1-> println("This is one")
        2-> println("This is two")
        else -> {
            println("Invalid entry")
            println("Enter valid number")
        }
    }

    var message = when(number1){
        1-> "This is one"
        2-> "This is two"
        else ->{
            "Invalid entry \nEnter valid number"
        }
    }
    println(message)
}


