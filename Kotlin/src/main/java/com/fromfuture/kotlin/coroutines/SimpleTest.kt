package com.fromfuture.kotlin.coroutines

import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class SimpleTest {
    @Test
    fun myFirstTest()= runBlocking {
        Assert.assertEquals(10, 5+5)
    }
}