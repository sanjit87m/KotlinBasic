package com.fromfuture.kotlin

/*
* List of constant
* Have properties and method
* Enum constant is an object
* Separate instance of constant
* *Initialized enum*
*  Initialized using primary constructor
*
* *Enum as Anonymous Classes*
*  - Implementing their own functions along with overriding the abstract functions
* *Enum properties and methods*
*   *Properties* *Methods*
*    Ordinal     values()
*    name        valuesOf()
* */

enum class PIZZA(var diameter: Int =30){
    SMALL{
        override fun prize(){
            println("Prize of small pizza is 150")
        }
    },
    MEDIUM{
        override fun prize(){
            println("The prize of medium pizza is 200")
        }
    },
    LARGE(50){
        override fun prize(){
            println("Prize of Large Pizza is 350")
        }
    };

    abstract fun prize()
}

fun main(args: Array<String>){
    println("The diameter of Pizza is ${PIZZA.SMALL.diameter}")
    PIZZA.LARGE.prize()
}