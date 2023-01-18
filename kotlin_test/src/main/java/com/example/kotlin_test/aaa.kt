package com.example.kotlin_test

data class Msg(var msg:String)

fun main(){
    val msgs =mutableListOf<Msg>()

    msgs.add(Msg("hello"))
    msgs.add(Msg("test"))
    msgs.add(Msg("bye"))


    msgs.forEach{
        println(it.msg)
    }


    var test:String?="hi"

    test = null

    println(test)
}