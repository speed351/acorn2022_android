package com.example.kotlin_test

/*
    Lambda expression(람다 표현식)
    - 익명함수를 람다라고 한다.

 */
fun main(){
    //f1 이라는 이름의 함수 만들기
    fun f1(){
        println("f1 call")
    }

    //만들 f1 함수 호출
    f1()

    //이름이 없는 함수를 만들어서 바로 호출 가능
    (fun(){
        println("lambda call")
    })()

    //이름이 없는 함수를 만들어서 변수에 담기
    val f2 = fun(){
        println("lambda call2")
    }

}