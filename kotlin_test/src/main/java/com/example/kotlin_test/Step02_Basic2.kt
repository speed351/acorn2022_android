package com.example.kotlin_test

fun main(){
    var myName="kim"
    var yourName="lee"

    //연결 연산자
    var result="내 이름 : " + myName
    var result2 = "너의 이름 : " + yourName

    //javascript에서 backtick을 이용해서 문자열 만들 때 사용했던 ${} 표현식 가능
    var result3 = "내 이름 : ${myName}"
    var result4 = "너의 이름 : ${yourName}"

    //읽기 전용 배열
    val names = listOf<String>("kim","lee","park")
    println(names[0])
    println(names[1])
    println(names.get(2))

    println("-----------------")

    //반복문
    for (i in names.indices){
        println("$i 번째 item : ${names[i]}")
    }

    println("-----------------")
    for(item in names){
        println(item)
    }
    println("-----------------")
    names.forEach{
        println(it)
    }
}