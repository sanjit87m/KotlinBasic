package com.fromfuture.kotlin.Advanced

/**
 * Function as parameter
 * Return a function
 *
 *
 * */

fun mailId(str:String):Unit{
    println("Email id is $str")
}

fun designation(str:String):Unit{
    println("Designation is $str")
}

fun employee(str: String, myfunc:(String)-> Unit){
    println("Employee name is Steve")
    myfunc(str)
}
fun main(args: Array<String>){
    employee("steve@infosy.com", ::mailId)
    employee("Manager", ::designation)
}