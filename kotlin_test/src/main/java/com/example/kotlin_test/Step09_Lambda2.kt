package com.example.kotlin_test

fun main(){
    /*
        in java => public void a(){}
        in kotlin => fun a():Unit{} or fun a(){ }
        코틀린에서 Unit 은 원시 type 이라고 지칭하고 java 의 void 와 비슷한 역할을 한다.

     */

    fun a():Unit{
        println("function a call")
    }

    a()
    val isRun:Boolean = true
    var myName:String? = null
    myName = "kim"

    //함수를 만들어서 변수에 담고 싶다면
    //type 추론이 가능하지만, 명시적으로 type을 표시하자고 한다면 어떻게 해야할까?
    /*
        ()->Unit은
        1. 함수에 전달되는 인자는 없으며
        2. 아무 값도 리턴하지 않는 함수 type이라는 뜻
     */
    val b:()->Unit = fun(){
        println("function b call")
    }
    b()

    val c:()->Unit = {
        println("function c call")
    }
    c()
    /*
        (String)->String은
        1. String type 을 인자로 받아서
        2. String type 을 리턴해주는 함수 type
     */
    val d:(String)->String = fun(name:String):String{
        return "1. my name is : ${name}"
    }
    //위를 아래와 같이 줄일 수 있다.
    val e:(String)->String = { name ->"2. my name is ${name}"}

    println(d("kim"))
    println(e("lee"))
}


















