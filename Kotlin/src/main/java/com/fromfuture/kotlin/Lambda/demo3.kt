package com.fromfuture.kotlin.Lambda

fun main(args: Array<String>){
    val myNumber = listOf(2,3,4,6,23,90)
//    val mySmallNumber = myNumber.filter { it<10 }
//    val mySmallSquaredNumber = mySmallNumber.map{it * it}
    val mySmallSquaredNumber = myNumber.filter { it<10 }.map { it * it }

    for (num in mySmallSquaredNumber)
        println(num)

    val people = listOf(Person("Sanjit", 10), Person("Bbhijit", 5), Person("Biswajit", 3))
    val peopleNames = people.filter { it.name.startsWith("B") }
                            .map { it.name }

    for (people in peopleNames)
        println(people)


//    val myMap = mapOf<Int,String>(2 to "Yogi", 4 to "Sabuj", 6 to "Soma")
//
//    val myMap1 = hashMapOf<Int,String>()
//    myMap1[44] = "sss"
//
//
//
//    val myMap2 = HashMap<Int,String>()
//    myMap2[33] = "ddd"
//    myMap2[44] = "sss"
//
//
//
//
//    for (key in myMap.keys)
//        println("Element at $key = ${myMap[key]}")
//
//
//
//    var array = Array<Int>(5){0}
//
//    val list = mutableListOf<String>()
//    val list2 = ArrayList<String>()
//    val list3 = arrayListOf<String>()
//
//
//
//    list.add("Yogi")
//    list.add("Modi")
//    list.add("Monmohan")
//
//
//
//    for (element in list)
//        println(element)
//    for (index in list.indices)
//        println(list[index])
//
//    array[3] = 45
//    array[4] = 67
//    for (value in array)
//        println(value)
//
//    for (index in array.indices){
//        println(array[index])
//    }
//
//
//    var person = Person()
//    with(person){
//        name = "Sanjit"
//        age = 3
//    }
//    println(person.name)
//    println(person.age)
//
//
//    person.apply {
//        name = "Patra"
//        age = 5
//    }.startRun()
//    println(person.name)
//    println(person.age)

}

//internal class Person{
//    var name = ""
//    var age = -1
//    fun startRun(){
//        println("Now I am ready to run")
//    }
//}


internal data class Person(val name:String, val age: Int)



