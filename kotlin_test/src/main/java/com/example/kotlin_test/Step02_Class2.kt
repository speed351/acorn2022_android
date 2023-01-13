package com.example.kotlin_test

//java 에서 dto처럼 여러개의 값을 저장할 객체를 생성할 클래스를 정의할 때, data class를 만든다.
data class Member(var num:Int, var name:String, var addr:String)

fun main(){
    val m1 = Member(1,"kim","seoul")

    //data class로 만든 객체의 참조값을 넣어주면, 참조값이 아닌 가지고 있는 값을 보여준다
    println(m1)
    //수정가능한 List(mutableList)를 얻어내서 참조값을 members에 저장
    val members =mutableListOf<Member>()
    members.add(m1)
    members.add(Member(2,"lee","busan"))

    println("-----------------------------------------")

    members.forEach{
        println(it)
    }
}