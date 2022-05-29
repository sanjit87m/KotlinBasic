package Practice

open class Shape1
class Rectangle : Shape1()
fun Shape1.getName() = "Shape"
fun Rectangle.getName() = "Rectangle"
fun printClassName(s: Shape1){
    println(s.getName())
}
fun main(args: Array<String>){
    printClassName(Rectangle())
}

