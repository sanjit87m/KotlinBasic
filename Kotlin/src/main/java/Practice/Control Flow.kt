package Practice

/**
 *
 *
 *
 *
 * */


fun main(){
    var number1 = 10
    if(number1 ==10){
        println("The number1 is equal to 10")
    }else{
        println("The number is not equal to 10")
    }

    var message = if(number1 ==10){
        "The number1 is equal to 10"
    }else{
        "The number is not equal to 10"
    }
    println("Message is $message")

    var message1 = if(number1<10) "Less" else "More"
    println("Message is $message1")
}