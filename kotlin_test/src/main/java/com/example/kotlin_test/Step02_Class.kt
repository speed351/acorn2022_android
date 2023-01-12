package com.example.kotlin_test

//클래스 정의하기
class MyCar

class YourCar{
    //멤버 함수
    fun drive(){
        println("rrrrrrrrrrrrrrrrrrrride")
    }
}
//대표생성자(primary)는 클래스 우측에 선언
//아무것도 전달받지 않는 생성자는 생략 가능, constructor도 생략가능
// ex. class AirPlane(){ || class AirPlane{
class AirPlane constructor(){
    //생성자
    init {
        println("aiiiiiiiiiiiiiiiiiiiiiiiiir")
    }
}

class AirPlane2(){
    init {
        println("aiiiiiiiiiiiiiiiiiiiir 2")
    }
}


class AirPlane3{
    init {
        println("aiiiiiiiiiiiiiiiiiiiir 3")
    }
}
fun main(){
    //클래스를 이용해서 객체 생성 in java => new MyCar()
    var c1 = MyCar()
    var c2 = YourCar()


    c2.drive()

    AirPlane()
    AirPlane2()
    AirPlane3()

}