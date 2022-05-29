package com.fromfuture.kotlin.Algortham.recursion




fun tailRecursion(string: String, index:Int) {
    if (string[index] == 'Z')
        return

    print(string[index])
    tailRecursion(string, index + 1)

}

fun headRecursion(string: String, index: Int){
    if(string[index] == 'Z')
        return

    headRecursion(string,index+1)
    print(string[index])
}
fun decimalToBinary(num :Int){
   if(num == 0)
       return
    decimalToBinary(num/2)
    print(num % 2)

}
//fun main(arg: Array<String>){
//// tailRecursion("ABCDZ",0)
////    println()
//// headRecursion("ABCDZ",0)
//    //decimalToBinary(10)
//    reverse("hello".toCharArray(),0,5)
//}
fun reverse( str: CharArray,  i :Int,  n:Int)
{
    if(i==n/2)
        return

   var temp = str[i]
    str[i] = str[n-1-i]
    str[n-1-i] = temp
    reverse(str, i+1,n)
}
fun main(arg: Array<String>){
   // print(countVowels("bbbbb".toCharArray(),3))



    print(A.MY_CONSTANT)


}

class A{
    val MY_CONSTANT = "CONSTANT"
companion object{
     val MY_CONSTANT = "constant"
}
}
fun countVowels(str: CharArray, n: Int): Int {
    return if (n == 0) 0
    else when (str[n - 1]) {
        'a', 'e', 'i', 'o', 'u' -> 1 + countVowels(str, n - 1)
        else -> 0 + countVowels(str, n - 1)
    }
}

//fun solution(A: IntArray): Int {
//    // write your code in Kotlin
//    for(i in A.indices){
//        if(a)
//
//    }
//    return 0
//}
