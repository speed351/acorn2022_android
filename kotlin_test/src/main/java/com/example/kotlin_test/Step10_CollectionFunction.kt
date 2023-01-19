package com.example.kotlin_test

val nums = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

fun main(){
    //목록에 저장된 모든 아이템을 순회하면서 어떤 작업하기
    println("forEach(fun(){})")
    nums.forEach(fun(item){
        print("$item  | ")
    })
    
    println("forEach({})")
    nums.forEach({
        print("$it  | ")
    })

    println("forEach{}")
    nums.forEach{
        print("$it  | ")
    }

    //목록에 저장된 모든아이템을 순회하면서 조건에 맞는 아이템만 남긴 새로운 목록 얻어내기
    val result = nums.filter {
        it>5
    }
    println("filter")
    print("$nums  | nums")
    print("$result  | filter result")
    println()
    //목록에 저장된 모든 아이템을 순회하면서 어떤 조작을 가한 새로운 목록 얻어내기
    val result2 = nums.map{
        it *2
    }
    print("$nums  | nums")
    print("$result2  | filter result2")
    println()

}