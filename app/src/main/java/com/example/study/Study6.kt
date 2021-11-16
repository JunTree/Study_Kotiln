package com.example.study/*
고차함수 - 함수를 클래스에 만들어 낸 인스턴스처럼 취급하는 방법
함수를 패러미터로 넘겨줄수도 있고, 결과값으로 반환 받을 수 있는 방법
함수 이름 앞에 콜론을 두개 붙여준다. ex) b(::a) - 일반함수를 고차함수로 바꾸기
fun main(){
    b(::a)
}

fum a (str:String){
    println("$str 함수 a")
}

fun b (function: (String) -> Unit){ ** Unit은 기본형 // String 타입을 기본형으로 바꾼다.
    function("b가 호출한")
}

출력 예)
b가 호출한 함수 a


람다 함수

fun main(){
    b(::a)
    val c:(String) -> Unit ={str -> println("$str 람다함수")} 다른방식 -> val c = {str:String -> println("$str 람다함수")}
    b(c)
}

fum a (str:String){
    println("$str 함수 a")
}

fun b (function: (String) -> Unit){
    function("b가 호출한")
}

출력 예)
b가 호출한 람다함수
람다식으로 작성된 함수는 그 자체가 변수를 담을 수 있는 1급 객체로 생성된다.
1. 변수나 데이터에 할당될 수 있어야한다.
2. 객체의 인자로 넘길 수 있어야 한다.
3. 객체의 리턴값이 될 수 있어야 한다.

일반적인 변수 선언처럼, 람다식도 데이터 타입을 명시할 수 있다.
람다식의 경우 파라미터와 리턴값을 같는 함수이기 때문에 데이터 타입을 표현하기 까다롭다.
파라미터를 리턴으로 표현할 수 있기 때문에 명시적이고 함수형 프로그래밍의 특징이다.



오브젝트 사용
fun main(){
    println(Counter.cnt)

    Counter.countUp()
    Counter.countUp()

    println(Counter.cnt)

    Counter.clear()

    println(Counter.cnt)
}

object Counter {
    var cnt = 0

    fun countUp(){
        count++
    }

    fun clear(){
        cnt = 0
    }
}

출력예)
0
2
0


fun main(){
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    pritnln("${a.name} : ${a.cnt}")
    pritnln("${b.name} : ${b.cnt}")
    println("총계:${FoodPoll.total}")


}
class FoodPoll(val name: String) {
    companion object{
        var total = 0
    }
    var cnt = 0
    fun vote(){
        total++
        cnt++
    }
}

출력예) 짜장 : 2
		짬뽕 : 3
		총계 : 5
 */