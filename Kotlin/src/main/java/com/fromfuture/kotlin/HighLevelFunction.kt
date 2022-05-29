package com.fromfuture.kotlin

/*


 */

fun mailId(str: String): Unit{
    println("Email Id is $str")
}
fun designation(str: String): Unit{
    println("Designation is $str")
}
fun employee(str: String, myfunc:(String)-> Unit){
    print("Employee name is Steve and his ")
    myfunc(str)
}

fun main(args: Array<String>){
    employee( "sanjit87m@gmail.com",:: mailId)
    employee("Manager", :: designation)
}