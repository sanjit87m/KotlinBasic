package com.fromfuture.kotlin

import java.lang.ArithmeticException

fun check(password: String){
    if(password.length <6)
        throw ArithmeticException("Password is too short")
    else
        println("Strong password")
}

fun main(args: Array<String>){
    check("priya")
}