package com.example.KotlinStudy
/*
fun main(){

    var t = Tiger()

    t.eat()

}

open class Animal{ // super클래스에서 open이 붙은 함수는 서브클래스에서 override하여 재구현 가능
    open fun eat(){
        println("음식을 먹습니다.")
    }
}

class Tiger : Animal() {
    override fun eat(){
        println("고기를 먹습니다.")
    }
}

오버라이딩- 이미 구현을 끝난 함수의 기능을 서브클래스에서 변경해야 할 때
출력 예)
고기를 먹습니다.



추상화
선언부만 있고 기능이 구현되어있지않은 추상함수 와 추상클래스로 구현

fun main(){
    var r = Rabbit()

    r.eat()
    r.sniff()
}

abstract class Animal(){
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit : Animal(){
    override fun eat(){
        println("당근을 먹습니다.")
    }

}

추상화    - 형식만 선언하고 실제 구현은 서브클래스에 일임
출력 예)
당근을 먹습니다.
킁킁



인터페이스 - 속성, 추상함수, 일반함수를 가짐
추상함수는 생섯자를 가질 수 있지만 인터페이스는 생성자를 가질 수 없다
인터페이스에서 구현부가 있는 함수 --> open 함수로 간주
구현부가 없는 함수 --> abstract 함수로 간주

별도의 키워드가 없어도 포함된 모든 함수를 서브클래스에서 구현 및 재정의가 가능
한번에 여러 인터페이스를 상속받을 수 있어서 유연한 구현이 가능

fun main(){
    var d = Dog()

    d.run()
    d.eat()

}

interface Runner{
    fun run()
}

interface Eater{
    fun eat(){
        println ("음식을 먹습니다.")
    }
}

class Dog : Runner, Eater {
    override fun run(){
        println("우다다다 뜁니다.")
    }
    override fun eat(){
        println("허겁지겁 먹습니다.")
    }
}
Dog는 두 인터페이스의 형식들을 모두 물려받아 사용하는 서브클래스가 됨
인터페이스 - 서로다른 기능들을 여러개를 물려주어야 할 때
출력 예)
우다다다 뜁니다.
허겁지겁 먹습니다.


-- 정리 --
오버라이딩- 이미 구현을 끝난 함수의 기능을 서브클래스에서 변경해야 할 때
추상화    - 형식만 선언하고 실제 구현은 서브클래스에 일임
인터페이스 - 서로다른 기능들을 여러개를 물려주어야 할 때.
 */