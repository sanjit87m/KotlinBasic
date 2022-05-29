package com.fromfuture.kotlin.Basic

fun main(args: Array<String>){
//    val obj: Any? = null
//    val str: String = obj as String
//    println(str)

//    val location: Any = "Kotlin"
//    val safeString: String? = location as? String
//    val safeInt: Int? = location as? Int
//    println(safeString)
//    println(safeInt)

//    val stringArray = Array<Int>(3){0}
//    for (i in stringArray.indices)
//        println(stringArray[i])
//    val myArray1= arrayListOf(1,2,4)

    val myArray2= intArrayOf(1,23,45,67,89)
    myArray2[0] = 5
//    for (i in 2..4)
//        println(myArray2[i])
//    for (element in myArray2)
//        println(element)

    for (index in myArray2.indices)
        println(index)


    //Smart Cast

    var string:String? = "Hello"
    if(string != null)
    print(string.length)
}