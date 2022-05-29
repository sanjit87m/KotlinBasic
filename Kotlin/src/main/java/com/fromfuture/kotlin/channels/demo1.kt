package com.fromfuture.kotlin.channels

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

fun CoroutineScope.produceSquares(): ReceiveChannel<Int> = produce {
    for (x in 1..5) send(x * x)
}

fun main() = runBlocking {
    val square = produceSquares()
    square.consumeEach {
        println(it)
    }
    println("Done")
}

//fun main() = runBlocking {
//    val channel = Channel<Int>()
//    launch {
//        for (x in 1..5) channel.send(x * x)
//        channel.close()
//    }
//
//    for (y in channel) println(y)
//    println("Done")
//}
//fun main() = runBlocking {
//    val channel = Channel<Int>()
//    launch {
//        for(x in 1..5)
//            channel.send(x*x)
//    }
//
//    repeat(5){
//        print("Received ")
//        println(channel.receive())
//    }
//println("Done")
//
//}