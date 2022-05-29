package com.fromfuture.kotlin

sealed class Shape
class Circle(var radius: Float): Shape()
class Rectangle(var length: Float, var breadth: Float):Shape()
class Square(var length: Float):Shape()
fun eval(e: Shape) =
    when(e){
       // is Circle-> println("Circle area is ${3.14 * e.radius * e.radius}")
        is Rectangle-> println("Rectangle area is ${e.length * e.breadth}")
        is Square-> println("Square area is  ${e.length * e.length}")
        else-> println("Unknown shape")
    }

fun main(args : Array<String>){
    val circle = Circle(5.0f)
    eval(circle)

}