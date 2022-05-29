package com.fromfuture.kotlin.Basic

/**
 * Function/Methods of Nullable Reference can't be called directly
 * '?.'- safe null operator
 * '?:' - Elvis operator
 * '!!' - non null assertion operator
 *
 */

fun main(){
    var str: String? = null
    println("The safe operator " + str?.length)
    var str_length = str?.length ?: 0
    println("The elvis operator" + str_length)

    println("The non null assertion "+ str!!.length)
}