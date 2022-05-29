package com.fromfuture.kotlin

fun main(args: Array<String>){
    val obj = Employee::class
    println(obj.isAbstract)
    println(obj.isData)

    val obj1 = Employee::calculate
    println(obj1.visibility)

    val obj2 = Employee::name
    println(obj2.get(Employee()))
}