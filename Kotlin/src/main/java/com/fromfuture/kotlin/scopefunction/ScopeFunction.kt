package com.fromfuture.kotlin.scopefunction
class Person{
    var name: String? = null
    var age: Int? = null
    fun startToRun(){
        println("Start to run")
    }
}

fun main(args: Array<String>){
    val person: Person? = null
    person?.apply {
        name = "Sanjit"
        age = 31
    }?.startToRun()
person?.run {
    name = "Sanjit with"
    age = 32
}

//    with(person){
//        name = "Sanjit with"
//        age = 32
//    }


    // also

//    val numberList: MutableList<Int> = mutableListOf<Int>(1,2,3)
//
//  val duplicateNumberList =  numberList.also {
//        it.add(4)
//        it.remove(2)
//    }
//    println("NumberList output $numberList")
//    println("Duplicate out $duplicateNumberList")

//    val name: String? = "sanjit"
//    name?.let {
//        println(it.reversed())
//        println(it.capitalize())
//        println(it.count())
//    }
}