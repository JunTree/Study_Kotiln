/*.
형변환
toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()
toChar()

ex)
var a: Int = 54321  // int에서 long으로 변환
var b: Long = a.toLong()

명시적 형변환 - 변환될 자료형을 개발자가 직접 지정함
암시적 형변환 - 변수를 할당할 시 자료형을 지정하지 않아도 자동으로 형변환이 됨

배열

var intArr = arrayOf(1,2,3,4,5)

var nullArr = arrayOfNulls<Int>(5) // 특정한 크기의 널로 채워진 배열

intArr[2] = 8 //인덱스에 8을 할당

println(intArr[4]) // 배열4번째의 값 출력

함수
fun add(a:Int, b:Int, c: Int): Int{   // 반환형 :Int 뒤에 {}열고 안에 리턴값을 주는 함수
    return a + b + c
}

fun add2(a: Int, b: Int, c: Int) = a + b + c // 단일형 = 뒤에 리턴값을 지정하는 함수 add1 과 add2는 같은 결과를 반환.

조건문

var a = 7
if (a > 10) {
    println("a는 10보다 크다")
} else{
    println("a는 10보다 작거나 같다")
}

when의 다중 조건문
when // 하나의 변수를 여러개의 값과 비교가능
	// 등호나 부등호는 사용 불가능
	// 여러개의 조건이 맞을 경우에도 먼저 부합하는 조건이 실행됨.

Any // 어떤 자료형이든 상관없이 호환되는  최상위 자료형

fun main(){
    doWhen(1)
    doWhen("Kotlin")
    doWhen(12L)
    doWhen(1234)
    doWhen("sky")
}

fun doWhen (a :Any){
    when(a){
        1 -> println("정수 1입니다.")
        "Kotlin" -> println("코틀린 Study 중입니다.")
        is Long -> println("Long 타입입니다.")
        !is String -> println("String타입이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }
}

출력 예시))
정수 1입니다.
코틀린 Study 중입니다.
Long 타입입니다.
String타입이 아닙니다.
어떤 조건도 만족하지 않습니다.

when의 표현식 //동작 대신 값을 반환
fun main(){
    doWhen(1)
    doWhen("Kotlin")
    doWhen(12L)
    doWhen(1234)
    doWhen("sky")
}
//이렇게 작성하게되면 when의 결과를 반환하거나 직접 값으로 사용 가능.
fun doWhen (a :Any){
    var result = when(a){
        1 -> "정수 1입니다."
        "Kotlin" -> "코틀린 Study 중입니다."
        is Long -> "Long 타입입니다."
        !is String -> "String타입이 아닙니다."
        else -> "어떤 조건도 만족하지 않습니다."
    }
    println(result)
}

출력 예시))
정수 1입니다.
코틀린 Study 중입니다.
Long 타입입니다.
String타입이 아닙니다.
어떤 조건도 만족하지 않습니다.


 */
