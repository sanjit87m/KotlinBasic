package Practice


sealed class Shape
class Circle(var radius:Float): Shape()
class Square(var lenght: Float, var breadth: Float): Shape()

fun eval(e: Shape) =
    when(e){
        is Circle -> println("Circle area is ${3.14 * e.radius * e.radius}")
        is Square -> println("Rectangle area is ${e.lenght * e.breadth}")
    }

fun main(args: Array<String>){
    val circle = Circle(5.0f)
    eval(circle)
}