package com.fromfuture.kotlin.Basic

/** *** String *****
 * String Interpolation
 * Adding placeholders in a string
 *
 *
 *
 */

fun main(args: Array<String>){
    var number1 = 10

    println("The number is" + number1)
    println("The number is $number1 and adding 10 to number ${number1 +10}")
}