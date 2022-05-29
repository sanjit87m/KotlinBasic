package com.fromfuture.kotlin

import java.nio.charset.Charset

fun main() {
println(People.test("Sanjit"))
for (i in 0..5)
    println(People.test("Sanjit${i}"))
}

internal class People{
    companion object{
        @JvmStatic
        fun test(string: String): String{
            return string
        }
    }
}

