package com.example.kotlin_test

//추상 클래스

abstract class Weapon{
    fun move(){
        println("moveeeeeeeeeeee")

    }

    abstract fun attack()
}

class MyWeapon : Weapon(){
    override fun attack() {
        println("attack")
    }
}

fun main(){
    val w1 = MyWeapon()
    w1.move()
    w1.attack()

    println("-------------------")

    /*
        with(참조값){
            참조값을 가지고(참조값과 함께) 여러가지 작업을 { }안에서 한다.
        }
     */
    with(w1){
        move()
        attack()
    }

    val w2 = object : Weapon(){
        override fun attack() {
            println("attackkkkkkkkkkkkkk")
        }
    }
    w2.move()
    w2.attack()
    
    //다형성 확인
    val a:MyWeapon = w1
    val b:Weapon = w1
    val c:Any = w1      //java의 object type에 해당












    
}