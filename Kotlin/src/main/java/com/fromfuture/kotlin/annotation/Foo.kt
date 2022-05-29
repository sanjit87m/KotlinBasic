package com.fromfuture.kotlin.annotation

import com.fromfuture.kotlin.Advanced.Fancy
import java.lang.Thread.sleep
import kotlin.reflect.KClass

//@Fancy class Foo {
//    @Fancy fun baz(@Fancy foo: Int): Int{
//        return (@Fancy 1)
//    }
//}

//class Foo @Fancy constructor(dependency: MyDependency){
//
//}

//class Foo {
//    var x: MyDependency? = null
//    @Fancy set
//}
//
//class MyDependency {
//
//}

//annotation class Special(val why: String)
//
//@Special("example") class Foo {}

//annotation class ReplaceWith(val expression: String)
//
//annotation class Deprecated(
//    val message: String,
//    val replaceWith: ReplaceWith = ReplaceWith("")
//)
//
//@Deprecated("This function is deprecated, use === instead", ReplaceWith("this === other"))
//class Foo {}

annotation class Ann(val arg1: KClass<*>, val arg2: KClass<out Any>)

@Ann(String::class, Int::class) class MyClass








