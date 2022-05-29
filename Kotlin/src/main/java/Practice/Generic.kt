
class Person<T>(private var age: T){
    init {
        this.age = age
        println("Ager : $age")
    }
     fun <T>printValue(value: T){
         println(value)
     }
}
//fun main(args: Array<String>){
//    var person = Person<Int>(30)
//    var person1 = Person<String>("Sanjit")
//    person.printValue(30)
//    person.printValue("String")
//
//}

// class ArrayUtil<T:Any>(private var array: Array<T>){
//     fun findElement(element: T, foundElement: (index: Int, element: T?) -> T?): Int {
//         for (i in array.indices){
//             if(element == array[i]){
//                 foundElement(i, element)
//                 return
//             }
//         }
//         foundElement(-1, null)
//     }
//
//
//     fun <T, A> singleArgViewModelFactory(constructor: (A) -> T) :(A)-> T{
//        return { A->
//            constructor(A)
//        }
//     }
// }

// fun main(args: Array<String>) {
//     var arrayUtil = ArrayUtil(arrayOf(3))
//     arrayUtil.findElement(4) { index,element ->
//     element
////         println("Index $index")
////         println("Element $element")
//
//     }
// }
//
// fun <T : ViewModel, A> singleArgViewModelFactory(constructor1: (A) -> T):
//             (A) -> ViewModelProvider.NewInstanceFactory {
//     return {
//             arg: A ->
//         object : ViewModelProvider.NewInstanceFactory() {
//             override fun <V : ViewModel?> create(modelClass: Class<V>): V {
//                 return constructor1(arg) as V
//             }
//         }
//     }
// }