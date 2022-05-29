package com.fromfuture.kotlin.scopefunction




fun main(args: Array<String>){
    Country().setUp()
}

private class Country{
    lateinit var name:String
    fun setUp(){
        name = "USA"
        println("The name of country is $name")
    }
}