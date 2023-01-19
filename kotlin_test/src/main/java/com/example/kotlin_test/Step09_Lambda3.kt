package com.example.kotlin_test

//함수 type 을 매개변수로 전달받는 함수
fun userFunc(f:()->Unit){
    //인자로 전달받은 함수를 호출하기
    f()
}

//인터페이스 정의하기
interface Drill{
    fun hole()
}

fun useDrill(d:Drill){
    d.hole()
}

fun main(){
    userFunc (fun(){
        println("function 1? call")
    })

    userFunc ({
        println("function 2? call")
    })

    userFunc {
        println("function 3? call")
    }
}