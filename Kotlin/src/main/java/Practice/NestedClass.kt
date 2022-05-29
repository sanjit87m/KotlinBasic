package Practice

import kotlin.math.E

/**
 *    Nested class
 * Allows you to define a class without another class
 * static by default
 * Data member and member function  - (.) dot notation without creating object of that class
 * Can't access of outer class
 * Similar to static Nested class in Java
 *
 *      Inner class
 *
 *      inner keyword
 *      Helps in accessing the outer class property
 *      Similar to no-static nested class in Java
 * */

class Employeee{
    var name: String = "Ram"
    var insuranceAmount: Int = 40000
    fun insuranceDetails(){
        println("$name has an insurance of $insuranceAmount")
    }

   inner class Dependent{
        var dependentName: String = "Sita"
        fun dependentDeatails(){
            println("$dependentName is also eligible for insurance $insuranceAmount")
        }
    }
}

fun main(args: Array<String>){
//Employeee.Dependent().dependentDeatails()

    var obj = Employeee().Dependent()
    obj.dependentDeatails()
}