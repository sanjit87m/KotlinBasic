package com.fromfuture.kotlin.Algortham

fun main(args: Array<String>){
    println(factorial(6))
}

fun factorial(n: Int): Int {
 if(n==1)
     return 1
   return n* factorial(n-1)
}

