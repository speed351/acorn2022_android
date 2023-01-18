package com.example.kotlin_test

class Util {
    //Util 클래스와 함께하는 동반객체
    companion object {
        //동반객체의 필드와 메소드(함수)를 정의하면 된다.
        val version:String = "1.1.2"
        fun send() {
            println("전송")
        }
    }
}
fun main(){
    //사용 불가능 해짐
    //Util().send()
    /*
        class 명에 .을 찍어서 동반객체에 있느 ㄴ필드나 메소드를 활용할 수 있다.
     */
    Util.send()
    println(Util.version)
}