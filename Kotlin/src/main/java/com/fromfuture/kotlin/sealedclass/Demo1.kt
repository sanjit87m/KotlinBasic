//package com.fromfuture.kotlin.sealedclass
//
//import jdk.internal.util.xml.impl.Attrs
//import java.awt.Graphics
//import java.awt.Shape
//import javax.naming.Context
//import javax.swing.text.Element
//import javax.swing.text.Position
//import javax.swing.text.View
//
///**
// * Empty class
// */
//class Empty
//
///**
// * Class
// *
// * */
//
////class Person{ }
///**
// * Class with primary constructor
// * */
//class Person(firstName: String)
//
///**
// * Constructor
// *
// * */
//
//class InitOrderDemo(name: String){
//    val firstProperty = "First property : $name".also(::println)
//    init {
//        println("First initializer block the prints $name")
//    }
//    val secondProperty = "Second property : ${name.length}".also { println() }
//
//    init {
//
//    }
//}
//
//internal  class MyView : View {
//    constructor(ctx: Element) : super(ctx)
//    constructor(ctx: Element, attrs: Attrs) : super(ctx)
//
//    override fun getPreferredSpan(p0: Int): Float {
//        TODO("Not yet implemented")
//    }
//
//    override fun paint(p0: Graphics?, p1: Shape?) {
//        TODO("Not yet implemented")
//    }
//
//    override fun modelToView(p0: Int, p1: Shape?, p2: Position.Bias?): Shape {
//        TODO("Not yet implemented")
//    }
//
//    override fun viewToModel(p0: Float, p1: Float, p2: Shape?, p3: Array<out Position.Bias>?): Int {
//        TODO("Not yet implemented")
//    }
//
//}
//internal open class Shape {
//    open fun draw(){}
//    fun fill() {}
//}
//
//internal class Circle : com.fromfuture.kotlin.sealedclass.Shape() {
//    override fun draw() {
//        super.draw()
//    }
//
//
//}
