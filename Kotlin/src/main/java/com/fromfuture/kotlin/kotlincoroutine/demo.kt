package com.fromfuture.kotlin.kotlincoroutine

import kotlinx.coroutines.*

fun main()= runBlocking{ // Execute in main thread
    println("Main program starts: ${Thread.currentThread().name}")

    val job1: Deferred<String> = async { // create a background thread
        println("Fake work starts1: ${Thread.currentThread().name} ")
        mySuspendedFunction(10000)
        println("Fake work finished1: ${Thread.currentThread().name}")
        "Sanjit1"
    }
    val job2: Deferred<String> = async { // create a background thread
        println("Fake work starts2: ${Thread.currentThread().name} ")
        mySuspendedFunction(5000)
        println("Fake work finished2: ${Thread.currentThread().name}")
        "Sanjit2"
    }
    val job3: Deferred<String> = async { // create a background thread
        println("Fake work starts3: ${Thread.currentThread().name} ")
        mySuspendedFunction(6000)
        println("Fake work finished3: ${Thread.currentThread().name}")
        "Sanjit3"
    }
    val job4: Deferred<String> = async { // create a background thread
        println("Fake work starts4: ${Thread.currentThread().name} ")
        mySuspendedFunction(2000)
        println("Fake work finished4: ${Thread.currentThread().name}")
        "Sanjit4"
    }
    println(job1.await())
    println(job2.await())
    println(job3.await())
    println(job4.await())



    // job.join()
    //mySuspendedFunction(2000)
    println("Main program ends: ${Thread.currentThread().name} ")
}

suspend fun mySuspendedFunction(time: Long){
   delay(time)
}