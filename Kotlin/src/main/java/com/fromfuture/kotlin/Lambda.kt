package com.fromfuture.kotlin

var lambda = {basicSalary: Int, bonus: Int -> (basicSalary * bonus)/100 }
var lambda1= { println("Lambda function ") }

fun employee(lmd: (Int,Int) -> Int){
    var result: Int = lmd(40000, 10)
    println("Employee got 10% bonus that is $result rupees")
}

fun main(args: Array<String>){
   var result = lambda1()

}