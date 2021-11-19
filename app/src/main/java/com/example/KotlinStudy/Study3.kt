/*반복문

while , do..while, for

do{
    println(a++)// 조건과 관계없이 반드시 한번은 실행 후 while문에 진입
} while( a < 5)

for(i in 0..9 step 3){
    print(i)
} // i가 0부터 9까지  1씩 증가
// step 3 --> 3씩 증가 step 5 --> 5씩 증가

for(i in 9 downTo 0 step 3){
    print(i)
} // i가 9부터 0까지 downTo를 사용 1씩 감소
// step 3 --> 3씩 감소 step 5 --> 5씩 감소

for(i in 'a'..'e'){
    print(i)
}// 'a'부터 'e'까지 반복package

흐름제어 연산자

break,continue

for (i in 1..10){
    if(i == 3 ) break
    print(i)
}
출력 예) 12

for (i in 1..10){
    if(i == 3 ) continue
    print(i)
}
출력 예) 1245678910

label -> 외부 반복문에 레이블 이름과 @기호를 달고 break,continue문에선 @와 레이블 이름을 달아주면 조건이 참일때 즉시 break,continue하고 중지함

loop2@for (i in 1..10){
    for ( j in 1..10){
        if(i == 1&& j == 2) break@loop2
        println("i: $i, j: $j")
	}
}
출력 예) i: 1, j: 1


클래스 - 값과 그 값을 사용하는 기능들을 묶어놓은 것, 인스턴스를 만드는 틀
인스턴스 - 클래스를 이용해서 만들어내는 서로다른 속성의 객체를 지칭하는 용어
클래스 = 속성(고유의 특징값) + 함수(기능의 구현)

fun main(){
    var a = Person("박보영", 1990)
    var b = Person("정전국", 1997)
    var c = Person("장원영", 2004)

    a.introduce()
    b.introduce()
    c.introduce()
}

class Person( var name:String, val:birthyear:Int){
    fun introduce(){
    	println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}
출력 예) 안녕하세요. 1990년생 박보영입니다.
		안녕하세요. 1997년생 전정국입니다.
		안녕하세요. 2004년생 장원영입니다.

생성자 - 새로운 인스턴스를 만들기 위해 호출하는 특수한 함수
		인스턴스의 속성을 초기화, 인스턴스 생성시 구문을 수행

init - 파라미터나 반환형이 없는 특수한 함수
		생성자를 통해 인스턴스가 만들어 질 때 호출되는 함수

fun main(){
    var a = Person("박보영", 1990)
    var b = Person("정전국", 1997)
    var c = Person("장원영", 2004)

}

class Person( var name:String, val:birthyear:Int){
    init{
    	println("안녕하세요, ${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }
}
출력 예) 안녕하세요. 1990년생님이 박보영님이 생성되었습니다.
		안녕하세요. 1997년생님이 전정국님이 생성되었습니다.
		안녕하세요. 2004년생님이 장원영님이 생성되었습니다.


보조생성자 - 기존형태의 생성자와 다른 형태로 생성자를 제공하여 인스턴스 생성시 편의를 제공하거나 추가적은 구문을 수행하는 기능을 제공하는 역할

un main(){
    var a = Person("박보영", 1990)
    var b = Person("정전국", 1997)
    var c = Person("장원영", 2004)

    var d = Person("이루다")
    var e = Person("차은우")
    var f = Person("류수정")

}

class Person( var name:String, val:birthyear:Int){
    init{
    	println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }
    constructor(name:String) : this(name, 1997){
        println("보조 생성자가 사용되었습니다.")
    }
}
출력 예) 1990년생 박보영님이 생성되었습니다.
		1997년생 전정국님이 생성되었습니다.
		2004년생 장원영님이 생성되었습니다.
		1997년생 이루다님이 생성되었습니다.
		보조 생성자가 사용되었습니다.
		1997년생 차은우님이 생성되었습니다.
		보조 생성자가 사용되었습니다.
		1997년생 류수정님이 생성되었습니다.
		보조 생성자가 사용되었습니다.

상속 - 속성과 함수를 물려주는 슈퍼클래스 물려받는 서브클래스가 있다.
open 클래스가 상속될 수 있도록 클래스 선언시 붙여줄 수 있다.

상속 특징 1 - 슈퍼 클래스에 존재하는 속성과 '같은이름'의 속성을 가질 수 없음
		 2 - 서브 클래스가 생성될 때는 반드시 슈퍼클래스의 생성자까지 호출되어야 함

fun main(){
    var a = Animal("별이",5,'개')
    var b = Dog("별이",5)

    a.introduce()
    b.introduce()

    b.bark()

    var c = Cat("나비", 1)
    c.introduce()
    c.meow()

}

open class Animal( var name: String, var age:Int, var type: String){
    fun introduce(){
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog ( name:String, age: Int): Animal (name,age,"개"){
    fun bark(){
        println("멍멍")
    }
}

class Cat (name:String, age:Int) : Animal(name,age,'고양이'){
    fun meow(){
        println("야옹야옹")
    }
}

출력 예) 저는 개 별이고, 5살입니다.
		저는 개 별이고, 5살입니다.
		멍멍
		저는 고양이 나비이고, 1살 입니다.
		야옹야옹

 */