package com.fromfuture.kotlin.Core

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking  {
     data class Person(var name: String, var age: Int)

    val flow = flow<String> {
        println("Flow producer thread start: ${Thread.currentThread().name}")
        for (i in 1..10){
            emit("Hello world")
            delay(1000)
        }
        println("Flow producer thread end: ${Thread.currentThread().name}")

    }
        println("Flow consumer top  thread start: ${Thread.currentThread().name}")

        launch {
            println("Flow consumer down  thread start: ${Thread.currentThread().name}")
            println(flow.first())
            println("Flow consumer down  thread end: ${Thread.currentThread().name}")
        }
    launch {
        println("Flow consumer down  thread start: ${Thread.currentThread().name}")
        flow.collect {
            println(it)
        }
        println("Flow consumer down  thread end: ${Thread.currentThread().name}")
    }
        println("Flow consumer top  thread end: ${Thread.currentThread().name}")


}


