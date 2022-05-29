package com.fromfuture.kotlin;

import java.nio.charset.Charset;

import kotlin.text.Charsets;

class Basic1 {
    public static void main(String[] args){

        System.out.println(("Hello".getBytes(Charset.forName("UTF-8"))));


//        val charset = Charsets.UTF_8
//        val byteArray = "Hello".toByteArray(charset)
//        println(byteArray.contentToString()) // [72, 101, 108, 108, 111]
//        println(byteArray.toString(charset))
    }
}
