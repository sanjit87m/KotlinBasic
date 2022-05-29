package Practice

open class Employee2{
    var company: String = " Infosys"
    var bonus: Int = 200
    open fun salary(){
        println("All the Employee's have got bonus")
    }
}

class SystemEngineer: Employee2(){
    var basicSalary: Int = 30000
    var salary: Int = basicSalary + bonus

   override fun salary(){
        println("The salary of System Engineer is $salary")
    }
}

class SeniorSystemEngineer: Employee2(){
    var basicSalary: Int = 40000
    var salary: Int = basicSalary + bonus
    override fun salary() {
        println("The salary of Senior System engineer is $salary")
    }
}

fun main(args: Array<String>){
    val obj = Employee2()
    obj.salary()
    val obj1 = SystemEngineer()
    obj1.salary()
    val obj2 = SeniorSystemEngineer()
    obj2.salary()
}