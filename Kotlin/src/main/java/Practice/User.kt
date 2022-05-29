package Practice

import java.lang.Exception
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


data class User(var name12:String, var age12:Int){
    init {
        name12 ="Sanjit"
        age12 = 30
    }
}

//fun main(arg: Array<String>){
//    val user = User("Sanjit", 23)
//    println("${user.name12} is Software engineer")
//    println(user.component1())
//    println(user.component2())
//
//    var (n,a) = user
//    print(n)
//    print(a)
//
//
//}
//
//fun main(args: Array<String>) {
////    inlineFunctionExample(
////        { println("Inlined function") },
////        { println("instead of object creation it copies data") })
//
////    val b = Number()
////    b.addNumber(10)
//
////    var str: String? = "Sanjit"
////    str.let { println(it) }
////    str = null
////    str.let { println(it) }
//    sumOfTwoArray(arrayOf(2,3,3), arrayOf(4,5,6))
//}
fun inlineFunctionExample(myfunc: () -> Unit, anorhter: () -> Unit){
    myfunc()
    anorhter()
    println("Hello Sanjit")


}

class Number{
    var number = 10

    infix fun addNumber(num: Int){
      this.number = number + num
    }
}



//fun main(args: Array<String>){
//    println(sumOfTwoArray(arrayOf(-1,2), arrayOf(1,2,3,4)).contentToString())
//}
fun sumOfTwoArray(arra1: Array<Int>, arr2: Array<Int>): Array<Int>{
    return if(arra1.size< arr2.size) {
        for (i in arra1.indices)
            arr2[i] = arra1[i] + arr2[i]
        arr2
    }else{
        for (i in arr2.indices)
            arra1[i] = arra1[i] + arr2[i]
        arra1
    }


}


//fun main(args: Array<String>){
//    println(subString("Sanjit Patra a",13))
//
//}

fun subString(string: String, k: Int) :String{
   return if(string.length<=k){
        string
    }else{
       var str = string.substring(0,k+1)

       str.substring(0, str.lastIndexOf(" ") )
   }

}

//fun main(args: Array<String>){
//    println(solution(arrayOf("lio","adam","eve"),arrayOf("121212","111111","4444455555"),"12"))
//}

fun solution(A: Array<String>, B: Array<String>, P: String): String {
    var name ="NO CONTACT"
    for(i in A.indices){
       if(B[i].contains(P)){
            if(name=="NO CONTACT")
                name = A[i]
            else
            {
                if (name > A[i])
                    name =A[i]
            }
        }
    }
    return name

}

//fun main(args: Array<String>){
//   var course1= Course(id = 1,name = "Maths", isPaid = false)
//
////    Student(subscribedCourses = [Course(name = "Maths", isPaid = false), Course(name = "Arts", isPaid = true)])
////    Student(subscribedCourses = [Course(name = "History", isPaid = true), Course(name = "Biology", isPaid = true)])
////    Student(subscribedCourses = [Course(name = "Physics", isPaid = true), Course(name = "History", isPaid = true)])
////    var students: Repository<Student> = {Student(subscribedCourses = [Course(name = "Maths", isPaid = false), Course(name = "Arts", isPaid = true)]),}
//}
typealias Id = Int

data class Student(val id: Id, val name: String, val subscribedCourses: List<Course>)
data class Course(val id: Id, val name: String, val isPaid: Boolean)
class University(private val repository: Repository<Student>) {
    fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int): Map<Course, Int>{
    val storedData = repository.get()
        val hasMap: HashMap<Course, Int> = HashMap()
    while(storedData.iterator().hasNext()){
        val student = storedData.iterator().next()
        var courses =student.subscribedCourses
        for (course in courses){
            if(course.isPaid) {
                if(hasMap.containsKey(course)){
                    hasMap[course]?.plus(1)
                }else{
                    hasMap[course] =1
                }

            }
        }
    }
        return  hasMap.toList().sortedBy { (_, value) -> value}.toMap()
    }

    //val hasMap: HashMap<Course, Int> = HashMap()


}


interface Repository<T> {
    fun get(): Iterable<T>
}

//fun main(args: Array<String>){
//    print(isPalindrome(10))
//
//}

fun isPalindrome(x: Int): Boolean {
    val stingX = x.toString()
    val charArray = stingX.toCharArray()
    val size = charArray.size
    for (i in 0 until size/2)
    {
       var temp = charArray[i]
        charArray[i] = charArray[size - i -1]
        charArray[size - i -1] = temp
    }
    return stingX.toCharArray().contentEquals(charArray)
}
//fun main(args: Array<String>){
//   // forLoop(3)
//}
//fun forLoop(n: Int){
//    for (i in 0 until n)
//        println(i)
//}

fun main(args: Array<String>){
    print(romanToInt("MCMXCIV"))
}
fun romanToInt(s: String): Int {
    var c = s.toCharArray()
    var sum =0
    val size = c.size
    var i=0
    while (i<size){
      var  value =0
        if(c[i]=='I' && i+1<size && c[i+1] =='V' ){
            i += 1
            value = 4
        }

        else if(c[i]=='I' && i+1<size && c[i+1] =='X' ){
            i+=1
            value = 9
        }

        else if(c[i]=='X' && i+1<size && c[i+1] =='L' ){
            i+=1
            value = 40
        }

        else if(c[i]=='X' && i+1<size && c[i+1] =='C' ){
            i+=1
            value = 90
        }

        else if(c[i]=='C' && i+1<size && c[i+1] =='D' ){
            i+=1
            value = 400
        }

        else if(c[i]=='C' && i+1<size && c[i+1] =='M' ){
            i+=1
            value = 900
        }

        else value = when(c[i]){
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else ->0
        }
        sum +=value
        i++
    }
    return sum

}

//fun romanToInteger(c:CharArray,i:Int, size: Int): Int{
//    if(c[i]=='I' && i+1<size && c[i+1] =='V' ){
//        i++
//        return 4
//    }
//
//    else if(c[i]=='I' && i<size && c[i+1] =='X' )
//        return 9
//    else if(c[i]=='X' && i<size && c[i+1] =='L' )
//    return 40
//    else if(c[i]=='X' && i<size && c[i+1] =='C' )
//        return 90
//    else if(c[i]=='C' && i<size && c[i+1] =='D' )
//        return 400
//    else if(c[i]=='C' && i<size && c[i+1] =='M' )
//        return 900
//else return when(c[i]){
//        'I' -> 1
//        'V' -> 5
//        'X' -> 10
//        'L' -> 50
//        'C' -> 100
//        'D' -> 500
//        'M' -> 1000
//        else ->0
//    }
//}

//fun longestCommonPrefix(strs: Array<String>): String{
//
//    for (i in strs.indices){
//
//    }
//
//}