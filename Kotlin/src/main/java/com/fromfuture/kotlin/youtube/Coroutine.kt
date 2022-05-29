package com.fromfuture.kotlin.youtube

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    //val list = foo()
   // for (x in list) println(x)

    val flow = foo()
    flow.collect {
        x -> println(x)
    }
}
//suspend fun foo(): List<String>  {
//    val list = mutableListOf<String>()
//    list.add(compute("A"))
//    list.add(compute("B"))
//    list.add(compute("C"))
//return list
//}
private suspend fun compute(string: String) : String{
    delay(1000)
    return string
}


//fun CoroutineScope.foo(): ReceiveChannel<String> = produce {
//    send(compute("A"))
//    send(compute("B"))
//    send(compute("C"))
//
//}

fun foo(): Flow<String> = flow{
    emit(compute("A"))
    emit(compute("B"))
    emit(compute("C"))
}

