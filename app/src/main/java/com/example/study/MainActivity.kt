/* 변수와 자료형.

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






*/