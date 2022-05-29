package com.fromfuture.kotlin.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {

    println("runBlocking: $this")
    launch {
        println("launch: $this")
        launch {
            println("launch: $this")

        }
    }
    async {
        println("launch: $this")
    }
    println("...... Some other code........")

}