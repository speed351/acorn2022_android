package com.example.kotlin_test

val nums2 = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

//친구 나이와 이름을 저장하는 data
data class Friend(val age:Int, val name:String)

fun main(){
    val result = nums2.filter { it>5 }.map{it*2}
    println(result)

    //nums2 목록에서 짝수만 골라서 제곱을 한 결과 목록을 얻어내보자
    val result2 = nums2.filter { it%2==0 }.map { it*it }
    println(result2)

    val f1 = Friend(17, "haerin")
    val f2 = Friend(20, "hani")
    val f3 = Friend(22, "minji")
    val f4 = Friend(18, "daniel")
    val f5 = Friend(19, "hyein")

    val friends = listOf(f1, f2, f3, f4, f5)
    //나이가 20 이상인 친구의 이름에 "님"을 붙인 새로운 목록 얻어내기
    val result3 = friends.filter { it.age>=20 }.map {it.name+"님"}
    println(result3)
}