package Practice

enum class PIZZA(var diameter: Int = 30) {
    SMALL{
        override fun prize(){
            println("The prize of small size is 150")
        }
    },
    MEDIUM{
        override fun prize(){
            println("The prize of medium size is 250")
        }
    },
    LARGE(40){
        override fun prize(){
            println("The prize of large size is 350")
        }
    };
    abstract fun prize()
}

fun main(args: Array<String>){
    println("The diameter of pizza is ${PIZZA.SMALL.diameter}")
    PIZZA.LARGE.prize()
    for (pizza in PIZZA.values()){
        println("${pizza.ordinal} = ${pizza.name} and diameter is ${pizza.diameter}")
        println("${PIZZA.valueOf("LARGE")}")
    }
}