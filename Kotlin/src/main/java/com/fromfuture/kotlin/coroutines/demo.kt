package com.fromfuture.kotlin.coroutines

import kotlinx.coroutines.*
import java.lang.Exception


fun main(args: Array<String>) = runBlocking {
    println("Main program starts:  ${Thread.currentThread().name}")
      val result: String? =   withTimeoutOrNull(2000){
            for (i in 0..500){
                print("$i.")
                delay(1)
            }
            "I am done"
        }
    println("\n Result: $result")
    println("Main program ends: ${Thread.currentThread().name}")
    }



