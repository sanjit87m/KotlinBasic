package Practice

import kotlin.math.sqrt

/**
 * Function
 * 1. Standard Library function : They are predefined function Example : print(), sqrt()
 * 2. User-Defined function :
 *
 *
 * */

fun main(){
//    val result = double(4)
//   print(result)
//    Stream().read()
//    print(Stream().powerOf(2,10))
//    A().foo(baz = 1)
//    A().foo(1){ print("hello")}
//    A().foo(qux = { print("world")})
//    A().foo{ print("Hello world")}
//    reformat("String!", false, upperCaseFirstLetter = true, dividedByCamelHumps = false,
//        wordSeparator = ' '
//    )
//    foo(string = *arrayOf("a","b","c"))
//    asList(1,2,3)
    val a = arrayOf(5,6,7)
    println(asList(1,2,3,*a,5,6))
    1 shl 2

}

infix fun  Int.shl(x: Int): Int{
    for( i in 1 until 10){

    }
    return 3
}

fun <T> asList(vararg ts: T): List<T>{
    val result = ArrayList<T>()
    for (t in ts){
        result.add(t)
    }
    return result
}

fun double(x: Int): Int{
    return 2*x
}
class Stream{
    fun read(){
        print("Read")
    }

    fun read(b: ByteArray, off: Int = 0, len: Int = b.size){

    }
    fun powerOf(number: Int, exponent: Int): Int {
        return  number * exponent
    }
}

open class A{
    open fun foo(i: Int = 10){

    }
    fun foo(bar: Int= 0, baz:Int){

    }
    fun foo(
        bar: Int = 0,
        baz: Int = 1,
        qux: () -> Unit){
        println(bar)
        qux()
    }
}

class B: A(){
    override fun foo(i: Int) {
        //super.foo(i)
    }
}

fun reformat(str: String,
normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             dividedByCamelHumps: Boolean = true,
             wordSeparator: Char =  ' '
){

}

fun foo(vararg string: String){


}

fun printHello(name: String?){
    if(name != null){
        println("Hello $name")
    }else{
        println("Hi there!")
    }

}
fun double1(x: Int) = x * 2

class MyStringCollection{
   private infix fun add(s: String){}
    fun build(){
        this add "abc"
        add("abc")
    }
}