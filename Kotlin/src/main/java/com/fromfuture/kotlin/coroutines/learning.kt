package com.fromfuture.kotlin.coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


//fun main() = runBlocking { // this: Coroutine Scope
//    launch { // launch a new coroutine and continue
//        println("New coroutine : ${Thread.currentThread().name}")
//        delay(1000) // non-blocking delay for 1 second
//        println("New coroutine : ${Thread.currentThread().name}")
//
//        println("World")
//    }
//    println("Main coroutine : ${Thread.currentThread().name}")
//    println("Hello") // main coroutines continues while previous one is delayed
//}

fun main() = runBlocking {
    word()
    println("Done")
}
suspend fun word() = coroutineScope{
    launch {
        delay(1000)
        println("world1")
    }

    launch {
        delay(2000)
        println("world2")
    }
    println("Hello")
}

