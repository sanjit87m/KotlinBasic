package com.meteor.org.kotlintest

class MyClass {
}

fun main(args: Array<String>){
    println("Hello world")
    val list = mutableListOf(1,2,3,4,5)
    list.map {
        println(it)
    }
}

//fun postItem(item: Item){
//    val token = requestToken()
//    val post = createPost(token,item)
//    processPost(post)
//}

fun postItem(item: Item){
    requestToken{token ->
        val post = createPost(token,item)
        processPost(post)
    }
}
fun processPost(post: Post) {

}

fun createPost(token: String, item: Item): Post {
return Post()
}

class Post {

}

fun requestToken(requestToken :  (String) -> Unit): Unit {
    requestToken("token")
}

class Item {

}
