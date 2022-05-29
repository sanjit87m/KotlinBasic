package Practice

/**
 *   Constructor
 * Special member function
 * Default constructor
 * Type
 * 1 Primary Constructor
 * 2 Secondary Constructor
 *  Primary constructor
 *
 * Initialized in the class header
 * "constructor" keyword
 * The parameter are optional
 * init block
 *
 * Secondary constructor
 *
 * One or more secondary constructor
 * "Constructor" keyword
 * Useful when there is a need to extend a class
 * this keyword
 *
 * */


class Insurance( var name: String){
    var spouseName: String = "Unknown"
    init {
        println("$name has an insurance of 400000 with 0 premium/month (init block)")
    }
    constructor(name: String, spouseName: String): this(name){
        this.spouseName = spouseName

        println("$spouseName has same insurance benefits as $name (secondary block)")

    }
}

fun main(args: Array<String>){
//    val obj = Insurance("Ram")
//
//        println("${obj.name}")

    val obj = Insurance("Ram", "Sita")
}