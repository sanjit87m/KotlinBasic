package Practice

open class StatusVisibility{
    var anyone = "Be kind to  everyone"
    private var onlyForMe = "Dream big work. Work hard"
    protected var friends = "A good friendship refreshes the soul"
    internal var friendOfFriends = "Best Friends are hard to find"
}

class Visibility: StatusVisibility(){
    fun access(){
        println("$friends")
    }
}

fun main(){
    val obj = StatusVisibility()
    println("${obj.anyone}")
}