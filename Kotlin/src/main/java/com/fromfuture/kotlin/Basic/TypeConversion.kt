package com.fromfuture.kotlin.Basic

/**
 *  ******* Type Conversion********
 *  Type conversion - one data type variable converted to another data type
 *  Implicit conversion - not supported
 *
 *
 */

fun main(){
    var number1:Int = 10
    var number2:Long = number1.toLong()
    println("$number2")
    var number3: Double = 23.5
    var number4: Int = number3.toInt()
    println("$number4")

}