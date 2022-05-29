package Practice

class Example{
    fun printFunctionType(){
        println("Class method")
    }
}
fun Example.printFunctionType(i: Int){
    println("Extension function")
}

//fun main(ars: Array<String>){
//    Example().printFunctionType(1)
//}
fun Any?.toString(): String {
    if(this == null) return "null"
    return toString()
}

class MyClass{
    companion object{}
}
fun MyClass.Companion.printCompanion(){println("Companion")}
//fun main(){
//    MyClass.printCompanion()
//}

open class Base{}
class Derived: Base(){}
open class BaseCaller{
    open fun Base.printFunctionInfo(){
        println("Base extension class in Basecaller")
    }

    open fun Derived.printFunctionInfo(){
        println("Derived extension function in Basecaller")
    }
    fun call(b: Base){
        b.printFunctionInfo()
    }
}

class DerivedCaller: BaseCaller(){
    override fun Base.printFunctionInfo(){
        println("Base extension class in DerivedCaller")
    }
    override fun Derived.printFunctionInfo() {
        println("Derived extension function in DerivedCaller")
    }
}

fun main(){
    BaseCaller().call(Base())
    DerivedCaller().call(Base())
    DerivedCaller().call(Derived())
}
