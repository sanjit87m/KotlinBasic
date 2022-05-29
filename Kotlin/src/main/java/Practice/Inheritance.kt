package Practice

/**
 *    Inheritance
 * Code re-usability
 *
 * 1. Single inheritance 2. Multi-Level inheritance 3. Hierarchical Inheritance
 * */

open class Insurance1(var name: String){
    init {
        println("$name has an insurance of 400000 with 0 premium/month(init block)")
    }
    constructor(name: String, spouseName: String): this(name){
        println("$spouseName has an insurance benefits as $name(secondary block)")

    }
}
class ExtendedFamilyInsurance: Insurance1{
//    init {
//        println("$name pays 3500 premium/month for insurance of his father $father (init block of child)")
//    }
    constructor(name:String, spouseName: String, father: String, fatherInlaw: String): super(name, spouseName){
        println("$fatherInlaw is father of $spouseName for who $ name pays 3500 premium/ month for insurance(secondary block of child)")

    }
}

fun main(args: Array<String>){
val obj = ExtendedFamilyInsurance("Ram", "Sita", "Parsana","ddddd")
}