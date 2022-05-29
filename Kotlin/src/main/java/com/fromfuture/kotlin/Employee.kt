package com.fromfuture.kotlin

data class Employee(var compamy: String = "Infosys"){
    var name: String ="Madhu"
    open fun calculate(basicSalary: Int, bonus: Int): Int {
        return basicSalary + bonus
    }
}