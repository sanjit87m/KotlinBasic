package Practice

/**
 *
 *      Abstract class
 *
 * Default - open and public
 * Abstract method and non-abstract method
 * Can't create instance (we can't create instance of the class)
 * Abstract property can't be initialized when declared
 * must be overiden  in derived class
 * Have no body
 *
 *
 *
 *
 *
 *
 * */

abstract class EmployeeA{
    var company: String = "Infosys"
    abstract var salary: Int
    fun display(){
        println("The engineer works in $company")
    }
    abstract fun salary()
}

class SystemEngineer1: EmployeeA(){
    override var salary = 30000
    override fun salary() {
        println("The default salary $salary")
    }

}

fun main(args: Array<String>){

    var obj = SystemEngineer1()
    obj.salary()

}