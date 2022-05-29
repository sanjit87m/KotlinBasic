package com.fromfuture.kotlin.Advanced

fun main(args: Array<String>){
    val program = Program()
    program.addTwoNumbers(3,7)
    program.addTwoNumbers(3, 7, object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val myLambda : (Int) -> Unit = {s: Int -> println(s)}
    program.addTwoNumbers(3,7) { println(it)}
    with(program){
    }
}

private class Program{
    fun addTwoNumbers(a : Int, b: Int, action : (Int) -> Unit){
        val sum = a + b
        action(sum)
    }
    fun addTwoNumbers(a: Int, b: Int, action: MyInterface){
        val sum = a + b
        action.execute(sum)
    }
    fun addTwoNumbers(a: Int, b: Int){
        val sum = a + b
        println(sum)
    }


}
interface MyInterface{
    fun execute(sum: Int)
}