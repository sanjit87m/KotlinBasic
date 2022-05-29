package Practice

/**
 *
 * 1. Container of data
 * 2. Fixed length
 * 3. Mutable
 * 4. arrayOf() intArrayOf()
 * 5.
 *
 *
 * */

fun main(args: Array<String>){
    var arr1= arrayOf(1,2,3,4,5)
    var arr2 = arrayOf<Int>(1,2,3,4)
    var arr3 = intArrayOf(1,2,3,4,5)

    var arr4 = arrayOf(1.0,2.0, 3.0)
    var arr5 = arrayOf('A','B','C')

    arr1[0] = 5
    println(arr1[0])
}