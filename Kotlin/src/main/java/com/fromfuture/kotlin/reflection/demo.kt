package com.fromfuture.kotlin.reflection
fun isEven(x:Int) = x*x
fun main(args: Array<String>){
    val myList = listOf<Int>(1,2,3,4,5,6,7,8)
   myList.map(::isEven).forEach(::println)
   // print(::isEven)
//    val obj = Employee::class
//println(obj.java)
}
internal data class Employee(val name: String, val age: Int)