/*
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

 */