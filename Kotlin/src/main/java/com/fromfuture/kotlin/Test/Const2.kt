package com.fromfuture.kotlin.Test

import com.fromfuture.kotlin.Algortham.recursion.A

class Const2 {
    fun getData(): String {
        return A.MY_CONSTANT
    }
}

fun main(args: Array<String>){
    val const2= Const2()
    print(const2.getData())
}