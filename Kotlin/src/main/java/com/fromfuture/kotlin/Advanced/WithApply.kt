package com.fromfuture.kotlin.Advanced

fun main(args: Array<String>){
    var person = Person()
with(person){
    name = "Sanjit"
    age = 30
    }
    person.apply {
        name = "Ram"
        age =32
    }.startRun()
    System.out.println(person.name)
    System.out.println(person.age)
}

class Person{
    var name: String = ""
    var age: Int = -1
    fun startRun(){
        println("Now I am ready to run")
    }
}