package com.final.kotlin


fun main(args : Array<String>){
    val program = Program()
    //program.addTwoNumbers(2,7)
    program.addTwoNumbers(2,7, object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    program.addTwoNumbers(2, 7) { s: Int -> println(s) }
}

private class Program {
    fun addTwoNumbers(a: Int, b: Int, action: MyInterface){
        val sum = a + b
        action.execute(sum)
    }
    fun addTwoNumbers(a: Int, b: Int) {
        val sum = a + b

    }

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {
        val sum = a + b
        action(sum)
    }
}

interface MyInterface{
    fun execute(sum: Int)
}