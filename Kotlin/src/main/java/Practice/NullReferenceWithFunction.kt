package Practice

/**
 * Function/Methods of Nullable References can't be called directly
 * "?." - safe null operator
 * "?:" - Elvis operator
 * "!!" - Non null assertion operator
 *
 * */
fun main(){
    var str: String? = "Hello World"

    println("The safe operator " + str?.length)

    var str_length = str?.length ?: 0

    println(" The elvis operator " + str_length)

    println(" The non null assertion " + str!!.length)
}