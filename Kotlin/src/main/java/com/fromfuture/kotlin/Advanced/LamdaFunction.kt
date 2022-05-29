package com.fromfuture.kotlin.Advanced

/**
 * Function with no name
 * Optimized function (function body)
 * Can pass lambda expression as argument
 *
 *
 * */

var lambda = {basicSalary: Int, bonus:Int ->(basicSalary * bonus)/100}

fun employee(lmd:(Int, Int) -> Int){
    var result: Int = lmd(40000,10)
    println("Employee got 10% bonus that is $result rupees")
}

fun main(args: Array<String>){
    employee(lambda)
}