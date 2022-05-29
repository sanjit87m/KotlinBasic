package com.fromfuture.kotlin.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import java.sql.Time
import java.util.*


fun main()= runBlocking  {
    println("Hello world")
    val flow = flow {
       println("Producer: ${Thread.currentThread().name}")
        for (i in 1..10){
            emit(i)
            delay(1000L)
        }
    }
    val job: Job = GlobalScope.launch {
        println("Consumer: ${Thread.currentThread().name}")
        flow.buffer().filter { it %2== 0 }.map { it *it }.collect {
            println("$it Time ${Calendar.getInstance().time}")
            delay(2000L)
        }
    }
    job.join()
}



suspend fun helloWorld(): String{
    return "Hello world"
}