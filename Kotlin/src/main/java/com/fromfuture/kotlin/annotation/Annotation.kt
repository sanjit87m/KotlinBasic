package com.fromfuture.kotlin.Advanced




@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION,
    AnnotationTarget.EXPRESSION,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy