package Practice

fun main(args: Array<String>){
//    try {
//        println("${10/0}")
//    }catch (e: ArithmeticException){
//        println("Divided by zero")
//    }

    val password = "Sant"
    if(password.length<6)
        throw ArithmeticException("Password is too short")
        else
        println("Strong password")



}

