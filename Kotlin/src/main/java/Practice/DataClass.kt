//package Practice
//
///**
// * Acts as a container just to hold data
// * 'Data' keyword
// * Avoids lengthy boilerplate code
// * Avoids lengthy boilerplate code
// * copy(), equals(), hashCode(), toString() and componentN()
// * Return multiple values
// *     Requirements
// *
// * Primary constructor - at least one parameter
// * Marked as val or var
// * Can't be open, abstract, inner or sealed
// * Implement interfaces
// *
// *
// *
// * */
//
//sealed class EmployeeData: Employee{
//    internal object None
//}
//
//interface Employee
//
//fun main(args: Array<String>){
//    val emp1 = EmployeeData("Sanjit", 30)
//    val emp2 = EmployeeData("Sanjit", 30)
//    if(emp1 == emp2)
//        println("Equals")
//    else
//        println("Not equals")
//
//    println("${emp1}")
//    var newEmp = emp1.copy()
//    println("${newEmp}")
//
//}