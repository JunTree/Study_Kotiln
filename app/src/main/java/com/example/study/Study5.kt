/*

프로젝트 - 여러개의 모듈 혹은 라이브러리 모듈을 붙이는 것

모듈 - 다수의 폴더와 파일, 리소스파일이 포함

패키지 - 개발시에 소스 코드의 소속을 지정하기 위한 논리적 단위

패키지를 지정하지 않으면 자동으로 default값이 지정됨

패키지지정시 폴더명과 패키지명을 일치시키지 않아도 됨
파일 상단의 패키지만 명시하면 컴파일러가 알아서 처리

Package 안에 변수 a,b,c 클래스d를 이름만 불러 사용 가능

패키지가 다를 시 import com.패키지이름 선언하면 다른 패키지의 함수 변수등을 사용 가능

클래스명과 파일명이 일치하지 않아도 됨 , 하나의 파일에 여러개의 클래스를 넣어도 알아서 컴파일

코틀린은 파일과 폴더로 구분하는 자바와 달리 파일내에 있는 package키워드를 기준으로 구분을 함


스코프와 접근제한자

접근 제한자- 스코프 외부에서 내부로의 접근을 제어

스코프 - ****변수, 함수, 클래스의 '공용범위'를 제어하는 단위****
패키지,클래스,함수 내부
*스코프 외부에서는 스코프 내부의 멤버를 참조연산자로만 참조가 가능
*동일 스코프 내에서는 멤버들을 공유 가능
*하위 스코프에서는 상위 스코프의 멤버를 재정의 가능
*스코프의 같은 레벨어서는 같은 이름의 멤버를 정의 x (conflicting declarations)선언부가 서로 충돌 오류발생


val a = "패키지 스코프"

class B{
    fun print(){
        println(a)
    }
}

fun main(){
    println(a)
    B().print()
}

출력예)
패키지 스코프
패키지 스코프

val a = "패키지 스코프"

class B{
    val a = "클래스 스코프"
    fun print(){
        println(a)
    }
}

fun main(){
    val a = "함수 스코프"
    println(a)
    B().print()
}
출력예)
함수 스코프
클래스 스코프

****접근제한자 - 스코프 외부에서 스코프 내부에 접근할 때 그 권한을 개발자가 제어할 수 있는 기능****
public , internal , private , protected
ex)	 private var a = '...'
public fun b {...}
internal class C{...}
**
패키지 스코프에서 사용하는 접근제한자
public (기본값) - 어떤 패키지에서도 접근 가능
internal    	- 같은 모듈 내에서만 접근 가능
private			- 같은 파일 내에서만 접근 가능
protected -->(사용x)
**
클래스 스코프에서 사용하는 접근제한자
public (기본값) - 클래스 외부에서 항상 접근 가능
private			- 클래스 내부에서만 접근 가능
protected		- 클래스 자신과 상속받은 클래스에서 접근가능
internal -->(사용x)


람다함수의 특별한 케이스
1. 람다함수도 여러 구문의 사용이 가능 ( 마지막줄의 결과값이 반환)
2. 패러미터가 없는 람다함수는 실행할 구문만 나열하면 됨
3. 패러미터가 하나라면 이름을 생략하고 it을 사용

스코프함수
****인스턴스의 속성이나 함수를 스코프내에서 깔금하게 분리하여 사용할 수 있기 때문에 코드의 가독성이 향상됨****
함수형 언어의 특징을 좀더 편하게 사용할 수 있도록 하는 함수
apply,run,with,also,let

apply - 인스턴스를 생성한 후 변수에 담기전에 초기화과정을 수행


fun main(){
    var price = 5000
    var a = Book("코틀린강의",10000).apply{
        name = "[초특가]" + name
        discount()
    }
    a.run{
        println("상품명:${name}, 가격:${price}원")
    }
    a.let{
        println("상품명: ${it.name}, 가격:${it.price}원")
    }
}

class Book(var name : String, var price : Int){
    fun discount(){
        price -= 2000
    }
}

출력예)
상품명:[초특가]코틀린강의, 가격:5000원
상품명:[초특가]코틀린강의, 가격:8000원


 */