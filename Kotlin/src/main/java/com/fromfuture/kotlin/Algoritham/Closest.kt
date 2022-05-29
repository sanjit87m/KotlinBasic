package com.fromfuture.kotlin.Algoritham

fun main(args: Array<String>){
    val s = "hackerrank"
    val queries = arrayListOf<Int>()
    queries.add(7)
    var result :Array<Int> = colsest(s, queries)
    for (i in result){
        println(i)
    }

}

fun colsest(s: String, queries: ArrayList<Int>): Array<Int> {
    var result = Array<Int>(queries.size){-1}
    for (i in 0 until queries.size){
        val target = s[queries[i]]
        val length = s.length
        var currentStep = 1
        val index = queries[i]
        while (index -currentStep >= 0 || index+currentStep<length){
            if (index - currentStep>=0 && s[index-currentStep] == target){
                result[i] = index - currentStep
                break
            }else if (index + currentStep < length && s.get(index + currentStep)== target){
                result[i] = index + currentStep
                break
            }
            currentStep ++
        }
    }
    return result

}
