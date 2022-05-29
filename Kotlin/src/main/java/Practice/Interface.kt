package Practice

/**
 *    Interface
 *
 *  1. "interface can't store state"
 *  2. All the property and method are abstract in nature
 *  3. Contains normal and abstract function
 *  4. Any number of interface can be implemented by an abstract class
 *
 *
 *
 *
 *
 *
 *
 * */

interface EmployeeInsurance{
    var premium: Int
    fun details(){
        println("Employee name is Ram")
    }
    fun insuranceDetails()
}

interface FamilyInsurance{
    var premium1: Int
    fun details1(){
        println("Employee father name is parsana")
    }
    fun familyInsurance()
}

class EmployeeI: EmployeeInsurance, FamilyInsurance{
    override var premium: Int =0
    override var premium1: Int =2000
    override fun insuranceDetails() {
        println("Employee pays $premium premium per month")
    }

    override fun familyInsurance() {
        println("Employee pays $premium1 per month for family")
    }
}

fun main(args: Array<String>){
    val obj = EmployeeI()
    obj.insuranceDetails()
    obj.familyInsurance()

}