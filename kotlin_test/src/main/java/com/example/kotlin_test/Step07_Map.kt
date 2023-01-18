package com.example.kotlin_test

fun main(){
    val mem:Map<String, Any> = mapOf("num" to 1, "name" to "kim" , "isMan" to true, "addr" to "seoul")
    val num = mem.get("num")
    val name = mem.get("name")
    val addr = mem.get("addr")

    val num2 = mem["num"]
    val name2 = mem["name"]
    val addr2 = mem["addr"]
    println(mem)


    //수정 가능한 Map
    val mem2 = mutableMapOf<String, Any>()
    mem2.put("num",2)
    mem2.put("name","lee")
    mem2.put("isMan",false)
    mem2.put("addr","busan")

    println(mem2)

    val mem3:MutableMap<String, Any> = mutableMapOf()

    mem3["num"] =3
    mem3["name"] = "park"
    mem3["isMan"] = true
    mem3["addr"] = "jeju"

    println(mem3)

}