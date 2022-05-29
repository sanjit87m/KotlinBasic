package com.fromfuture.kotlin.sealedclass

import java.lang.Exception

//sealed interface Expr
//sealed class MathExpr(): Expr
//data class Const(val number: Double) : MathExpr()
//data class Sum(val e1: Expr, val e2: Expr) : MathExpr()
//object NotANumber : Expr

sealed class Result<out T: Any>{
    data class Success<out T: Any>(val data: T) : Result<T>()
    data class Error(val exception: Exception): Result<Nothing>()
    object Inprogress : Result<Nothing>()
}

fun handleResult(result: Result<Int>){
    val action = when(result){
        is Result.Error -> TODO()
        is Result.Success -> TODO()
        Result.Inprogress -> TODO()
    }
}
