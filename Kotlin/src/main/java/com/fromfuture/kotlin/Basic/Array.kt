package com.fromfuture.kotlin.Basic


/** *** Array  ***
 * Container of data
 * Contains homogeneous data
 * Immutable - Fixed length
 * Mutable - You can change the value of the array.
 * arrayOf()
 * intArrayOf()
 *
 *
 *
 */

fun main(args: Array<String>){
    var arr1 = arrayOf(1,2,3,4)
    var arr2 = arrayOf<Int>(1,2,3,4)
    var arr3 = intArrayOf(1,2,3,4)

    var arr4 = arrayOf(1.0,2.0,3.0)
    var arr5 = arrayOf("A","B","C")

    var arr6 = IntArray(5){0}
    var arr7 = Array<String>(5){"Sanjit"}
    var arr8 = DoubleArray(3){3.0}
   // var
    for (i in arr6){
        arr6.set(i,5)
        println(arr6.get(i))
    }




//    arr1[0] =5
//    arr2.set(1,8)
//    println(arr1[0])
//    println(arr2.get(1))
}