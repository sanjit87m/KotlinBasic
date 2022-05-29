package com.fromfuture.kotlin.Advanced

fun manger(basicSalary: Int): Int{
    var bonus:Int = (basicSalary *10)/10
    var salary: Int = basicSalary + bonus
    return salary
}

fun employeeH(): (Int) -> Int{
    println("Employee name is Steve and his salary is")
    return ::manger
}

fun main(args: Array<String>){
    var result = employeeH()
    var result1 = result(50000)
    println("$result1")
}