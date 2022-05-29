package com.fromfuture.kotlin.Basic

fun main(args: Array<String>){
    var number1 = 11
    if(number1 == 10){
        println("The number is equal to 10")
    }else{
        println("The number is not equal to 10")
    }

    var message = if(number1 ==10){
        "The number is equal to 10"
    }else{
        "The number is not equal to 10"
    }
    println(message)

    var message1 = if(number1<10) "Less" else "More"
    println(message1)
}