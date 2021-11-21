package com.example.KotlinStudy/*
 오버로딩: 같은 스코프 안에서 같은 이름이 같은 함수를 만들 수 있는 것


fun main(){
   read(7)
   read("감사합니다.")

}

fun read(x: Int){
    println("숫자 $x 입니다.")
}

fun read(x: String){
    println(x)
}

출력예)
숫자 7 입니다.
감사합니다.

dafault argument
named arguments - 패러미터의 순서와 관계없이 패러미터의 이름을 사용하여 직접 패러미터의 값을 할당하는 기능

fun main(){
    deliveryItem("짬뽕")
    deliveryItem("책",3)
    deliveryItem("노트북", 30, "학교")

    dliveryItem("선물", destination = "친구집") // count는 기본값인 1로 할당, destination은 직접 지정했기 때문에 친구집으로 할당
}

fun deliveryItem(name: String, count:Int =1 , destination:String="집"){
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}

출력예)
짬뽕, 1개를 집에 배달하였습니다
책, 3개를 집에 배달하였습니다.
노트북, 30개를 학교에 배달하였습니다.
선물, 1개를 친구집에 배달하였습니다.

variable number of arguments( vararg )
- 같은 자료형을 개수에 상관없이 패러미터로 받고 싶을 때 사용
- 다른 패러미터와 같이 쓸 때는 반드시 맨 마지막에 위치해야함

fun main(){
    sum(1,2,3,4)
}

fun sum(vararg numbers: int){
    var sum = 0

    for(n in numbers){ // vararg는 for문으로 참조가능
        sum += n
    }
    print(sum)
}

출력예)
10



infix  - 마치 연산자처럼 사용할 수 있다.

fun main(){
    println(6 multiply 4) // 6== this , 4 == x
    println(6.multiply(4))
}
//					   패러미터  반환값
infix fun Int.multiply(x: Int) : Int = this * x //클래스 안에서 적용할 경우 적용할 클래스가 자기 자신이므로 class이름은 쓰지 않는다.


출력예)
24
24

 */