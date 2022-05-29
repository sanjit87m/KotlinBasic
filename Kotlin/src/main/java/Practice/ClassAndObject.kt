package Practice

/**
 *   Class
 * Blueprint for the objects
 * Define a class before creating objects
 * 'Class' keyword
 * Class declaration - class name, class header and class body
 *
 *  Object
 *
 *  Has state and behavior
 *  Used to access the properties and member functions of a class
 *  Multiple objects of a class
 *
 * */

class Employee{
    var name: String = "Ram"
    var insuranceAmount: Int = 400000
    fun insuranceDetails(){
        println("$name has an insurance of $insuranceAmount")
    }
}
fun main(args: Array<String>){
    val obj = Employee()
    println("Employee name is ${obj.name} ")
}