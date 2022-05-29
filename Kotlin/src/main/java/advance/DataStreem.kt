package advance

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking


fun main()= runBlocking{
    //val list = foo()
    //for (x in list) println(x)
//    val scope = CoroutineScope(Job())
//    val channel = scope.fooo()
   // for (x in channel) println(x)

   val flow =  strings()
    flow.collect { x -> println(x) }
}

// private fun foo(): List<String>  {
//    val list = mutableListOf<String>()
//    list.add(compute("A"))
//    list.add(compute("B"))
//    list.add(compute("C"))
//return list
//}
private fun compute(string: String): String{
    return string
}

private fun CoroutineScope.fooo(): ReceiveChannel<String> = produce {
    send(compute("A"))
    send(compute("B"))
    send(compute("C"))
}

fun strings(): Flow<String> = flow {
    emit("A")
    emit("B")
    emit("C")
}