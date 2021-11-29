package com.example.KotlinStudy
/* 변수와 자료형...

var == 일반적으로 통용되는 변수, 언제든지 읽기 쓰기가 가능하다.
val == 선언시에만 초기화 가능 중간에 값을 변경할 수 없다.
runtime시 변경되지 말아야할 값은 val을 사용한다.
Kotiln은 기본변수에서 null을 허용하지 않는다.
변수에 값을 할당하지 않은채로 사용하면 문법 에러가 난다.
null pointer exception을 원천적으로 차단한다.
var a: Int? = null  자료형 뒤에 ?를 붙이면 null을 허용하는 nullable 변수로 선언가능하다.

기본 자료형은 자바와 거의 동일하다.
정수형
Byte 8bits Short 16bits
Int 32bits Long 64bits
실수형
Float 32bist Double 64bits

정수형의 리터럴표시
10진수 16진수 2진수로 표기가능
var intValue:Int = 1234
var LongValue:Long = 1234L
var intvalueByhex:Int = 0x1af  16진수
var intValueByBin:int = 0b10110110  2진수

실수형의 리터럴표시
var doubleValue:Double = 123.5
var doubleValueWithExp:Double = 123.5e10 10진수
var floatValue:Float = 123.5f  16비트의 float형

문자형 UTF-16BE
코틀린은 문자 하나하나가 2bytes의 메모리 공간을 사용한다.

Char의 리터럴표시
var charValue:Char = 'a'
var koreancharValue:Char = '가'

특수문자 표시
\t	탭
\b	백스페이스
\r	첫 열로 커서옮김
\n	개행
\''	작은 따옴표
\""	큰 따옴표
\\	역 슬래시
\$	$문자
\uxxxx	유니코드문자

boolean 리터럴표시
var boolenavalue:Boolean = ture
var boolenavalue:Boolean = flase

문자열 표시
val stringvalue = "one line string test"
val multiLineStringValue = """ 3개의 따옴표multiline
string
test 줄바꿈이나 특수문자까지 그대로 문자열로 사용 가능 """

변수의 다양한 사용방법
var - 한번 할당한 객체가 있어도 다른 객체로 변경하여 할당 가능
ex)
var a = Person("유나", 2003)
a = Person("루다", 1997)

val - 한번 객체를 할당하면 변경불가능

val a = Person("케이", 1995)
a = Person("조이", 1996) --- X

상수 - 컴파일 시점에 결정되어 절대 바꿀 수 없는 값, 기본 자료형만 선언가능
	   런타임에 생성될 수 있는 일반적인 클래스의 객체들은 담을 수 없음
	   클래스의 속성이나 지역변수로 사용 불가능

	class Sample{
		companion object{ // companion object 안에 선언되어야 함
            const val CONST_A = 1234
        }
    }
const val CONST_A = 1234

fun main(){
    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

}

class FoodCourt{
    fun searchPrice(foodName: String){
        val price = when(foodName){
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        println("${foodName}의 가격은 ${price}원 입니다.")
    }
    companion object{ // 상수로 값을 고정하여 성능 향상. 객체를 생성하게 되면 시간이 더 오래걸림
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}

출력예)
크림파스타의 가격은 13000원 입니다.
스테이크의 가격은 25000원 입니다.
피자의 가격은 15000원 입니다.

늦은 초기화

lateinit - 변수만 선언하고 초기값의 할당을 나중에 함
		- 초기값 할당 전까지 변수를 사용할 수 없음
		- 기본 자료형에는 사용할 수 없음
		- 변수에 초기화 여부는 ::a.islnitialized를 사용


fun main(){
    val a = LateInitsample()

    println(a.getLateInitText())
    a.text = "새로 할당한 값"
    println(a.getLateInitText())
}

class LateInitSample{
    lateinit var text: String

    fun getLateInitText(): String {
        if(::text.isInitialized){
            return text
        }
        else{
            return "기본값"
        }
    }

}

출력예)
기본값
새로 할당한 값


지연 대리자 속성
lazy delegate properties - 변수를 사용하는 시점까지 초기화를 자동으로 늦춰줌
						- 코드에서는 선언시 즉시 객체를 생성 및 할당하여 변수를 초기화하는 형태
						- 실제 실행시에는 변수를 사용하는 시점에 초기화를 진행
by lazy로 사용

fun main(){
    val number: Int by lazy{
        println("초기화를 합니다")
        7
    }

    println("코드를 시작합니다.")
    println(number)
    println(number)
}

출력예)
코드를 시작합니다.
초기화를 시작합니다.
7
7

*/