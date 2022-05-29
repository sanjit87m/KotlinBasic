import java.util.*

fun main(args: Array<String>){
    var result =0
    val program = Program()
    program.addTwoNumbers(2,3)
    program.addTwoNumbers(2,3, object : MyInterface {
        override fun execute(sum: Int) {
            println(sum)
        }
    })
    program.addTwoNumbers(2,3) {s: Int -> println(s) }
  //  program.addTwoNumbers(2,3) { x, y -> x + y }
    program.addTwoNumbers(2,3){x,y -> result = x + y}
    println(result)
    program.reverseAndDisplay("hello") {it.reversed()}

}

private class Program{
    fun addTwoNumbers(a: Int, b: Int){
        val sum = a + b
        println(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface){
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: (Int)-> Unit){
        val sum = a + b
        action(sum)
    }

//    fun addTwoNumbers(a: Int, b: Int, myFunction: (Int, Int) -> Int){
//        val result = myFunction(a,b)
//        println(result)
//    }

    fun addTwoNumbers(a: Int, b: Int, myFunction: (Int, Int) -> Unit){
        myFunction(a,b)

    }
    fun reverseAndDisplay(str: String, myFunction: (String)-> String){
        println( myFunction(str))
    }
}

interface MyInterface{
    fun execute(sum: Int)
}