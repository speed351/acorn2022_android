package com.example.kotlin_test

class Cat constructor(){
    //init 블럭은 primary 생성자의 일부이다.
    init {
        println("catttttttttttttttt")
    }
    // 필드
    // null값을 허용하고 싶으면 type 뒤에 ?를 붙인다.
    var name:String? = null

    //primary 생성자 외의 추가 생성자 정의하기
    // :this()는 대표 생성자를 호출하는 표현식
    constructor(name:String) : this(){
        println("cat's name : $name")
        this.name = name
    }
}

fun main(){
    Cat()
    Cat("coco")
    //kotlin에서는 모든 data가 참조 data type이다
    var num:Int? = null
}