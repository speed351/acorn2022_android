package com.example.kotlin_test
import com.example.kotlin_test.java.Member
import com.example.kotlin_test.java.MemberDto

fun main(){
    val mem1 = Member()
    mem1.num=1
    mem1.name="kim"
    mem1.addr="seoul"
    mem1.showInfo()

    val mem2 = MemberDto()
    //내부적으로 java의 setter 메소드가 호출된다.
    mem2.num = 2
    mem2.name = "lee"
    mem2.addr = "jeju"

    //내부적으로 java의 getter 메소드가 호출된다.
    val a = mem2.num
    val b = mem2.name
    val c = mem2.addr

}