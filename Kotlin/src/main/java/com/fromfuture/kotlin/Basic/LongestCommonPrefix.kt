package com.fromfuture.kotlin.Basic

import Practice.reformat
import java.util.*
import kotlin.collections.ArrayList


//    fun main(args: Array<String>){
//var strs: Array<String> = arrayOf("flower","flat")
//        print(longestCommonPrefix(strs))
//    }
    fun longestCommonPrefix(strs: Array<String>): String {
        var temp:String =""
        var flag: Boolean = true
        var i =0
        while (flag) {
            var tempChar: Char? = null
            for (j in strs.indices) {
                var charArray: CharArray = strs[j].toCharArray()
                if (i < charArray.size) {
                    if (j == 0) {
                        tempChar = charArray[i]
                    } else if (tempChar == charArray[i]) {
                        continue
                    } else {
                        tempChar =null
                        flag = false
                        break
                    }
                } else {
                    tempChar =null
                    flag = false
                    break
                }
            }
            if(tempChar!=null){
                temp += tempChar
                i++
            }else flag =false

        }
        return  temp
    }

//fun main(args: Array<String>){
//   // print(isValid("(])"))
//    for (i in 0 until 5)
//        println(i)
//}
fun isValid(s: String): Boolean {
    var charArray: CharArray = s.toCharArray()
    var arrayList:ArrayList<Char> = ArrayList()
    for (i in charArray.indices){
        if(i==0) {
            if (charArray[i] == ')' || charArray[i] == '}' || charArray[i] == ']')
                return false
        }
            if(charArray[i]=='(')
                arrayList.add('(')
            if(charArray[i]=='{')
                arrayList.add('{')
            if(charArray[i]=='[')
                arrayList.add('[')
            if(charArray[i]==')'){
                if(arrayList.isNotEmpty() && arrayList.last()=='(')
                    arrayList.removeAt(arrayList.lastIndex)
                else
                   return false
            }
            if(charArray[i]=='}'){
                if(arrayList.isNotEmpty() && arrayList.last()=='{')
                    arrayList.removeAt(arrayList.lastIndex)
                else
                    return false
            }
            if(charArray[i]==']'){
                if(arrayList.isNotEmpty() && arrayList.last()=='[')
                    arrayList.removeAt(arrayList.lastIndex)
                else
                   return false
            }

        }
    return arrayList.isEmpty()
    }
//fun main(args: Array<String>){
//
//   //print(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
//    print(removeElement(intArrayOf(3,2,2,3), 2))
//
//}

fun removeDuplicates(nums: IntArray): Int {
    var index =1
for (i in 0 until nums.size -1){
    if(nums[i] != nums[i+1])
        nums[index++] = nums[i+1]
}
    print(nums.contentToString())
return index
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    var index = 0
    for(i in nums.indices){
        if(nums[i] != `val`)
            nums[index++] = nums[i]
    }
    print(nums.contentToString())
    return index
}

//fun main(args: Array<String>){
//print(lengthOfLongestSubstring("pwwkew"))
//}
fun lengthOfLongestSubstring(s: String):Int {
    var charArray:CharArray = s.toCharArray()
    var substring: String =""
    var tempString:String =""
    for(element in charArray)
        if(!tempString.contains(element))
            tempString+= element
        else
        {
            if(tempString.length> substring.length){
                substring = tempString
                tempString =""
                tempString += element
            }
        }
    return substring.length
}



//fun main(args: Array<String>){
//
//    println(reverseOfWords(" the sky   is blue  "))
//}

fun reverseOfWords(s: String) : String{
    val splitWords: List<String> = s.split(" ")
    val size = splitWords.size
    var string: String = ""
    for(i in 0 until size){
        if(splitWords[size -i -1] == "")
            continue
        string += if(string.isEmpty()) splitWords[size -i -1] else " " + splitWords[size -i -1]
    }
    return string
}

//fun main(args: Array<String>){
//println(lengthOfLastWord("a "))
//}
fun lengthOfLastWord(s: String): Int {
    val splitWords: List<String> = s.split(" ")
    val size = splitWords.size
    for(i  in splitWords.indices){
        if(splitWords[size - i -1].isEmpty())
            continue
        return splitWords[size - i-1].length
    }
    return  0
}
fun main(args: Array<String>){
    println(plusOne(intArrayOf(9,8,7,6,5,4,3,2,1,0)).contentToString())
}

fun plusOne(digits: IntArray): IntArray {

    var c =0
    var arrayList = ArrayList<Int>()
    var plusOne = 1
    var tempDigits=0
    for (i in digits.indices){
        tempDigits = digits[digits.size -i -1]
        tempDigits += plusOne + c
        plusOne =0
        if(tempDigits>9){
            tempDigits %= 10
            c=1
            arrayList.add(0,tempDigits)
        }else{
            arrayList.add(0,tempDigits)
            c=0
        }
    }
    return arrayList.toIntArray()
}




















































