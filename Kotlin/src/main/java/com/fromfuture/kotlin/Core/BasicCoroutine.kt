//package com.fromfuture.kotlin.Core
//
//import kotlinx.coroutines.*
//
//fun main() = runBlocking { // Execute in main thread
//    println("Main program start: ${Thread.currentThread().name}")
//    val job: Job = launch { //c1
//        println("Fake work starts c1: ${Thread.currentThread().name}")
//        mySuspendFunc(1000)
//      val job3 =   launch { //c3
//            println("Fake work starts c3: ${Thread.currentThread().name}")
//            mySuspendFunc(4000)
//            println("Fake work finish c3: ${Thread.currentThread().name}")
//        }
//        job3.join()
//        println("Fake work finish c1: ${Thread.currentThread().name}")
//
//    }
////        launch { //c2
////            println("Fake work starts c2: ${Thread.currentThread().name}")
////            println("Fake work finish c2: ${Thread.currentThread().name}")
////        }
////    launch { //c3
////        println("Fake work starts c3: ${Thread.currentThread().name}")
////        mySuspendFunc(4000)
////        println("Fake work finish c3: ${Thread.currentThread().name}")
////    }
//    //mySuspendFunc(2000)
//    job.join()
//    println("Main program end: ${Thread.currentThread().name}")
//}
//
//suspend fun mySuspendFunc(time: Long) {
//    delay(time)
//}