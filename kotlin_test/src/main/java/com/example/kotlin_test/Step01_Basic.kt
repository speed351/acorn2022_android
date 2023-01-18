package com.example.kotlin_test
/*
    함수명 : sum
    함수에 전달한 인자의 개수 : 2개
    인자의 type : Int
    함수의 리턴 type : Int

 */
fun sum(a:Int, b:Int):Int{

    return a + b
}

fun main(){
    println(sum(10  ,20))
    println(sum(30,20))

    val a=10
    var b=10
    var c:Int=10
    // 값이 대입되면서 String type으로 myName이 만들어진다.
    val myName = "kim"
    // String type으로 선언된 yourName에 값 대입하기
    val yourName:String = "lee"
    // String type ourName변수 만들고
    val ourName:String
    ourName="park"


    val names=listOf<String>("kim", "lee", "park")

    val d = names[1]
    println(d)


    val nums = listOf<Int>(10, 20, 30)
    nums.forEach{
        println(it)
    }

}