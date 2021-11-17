/*
클래스의 다형성
- 클래스의 상속관계에서 오는 인스턴스의 호환성을 적극 활용가능
- 수퍼클래스가 같은 인스턴스를 한번에 관리하거나 인터페이스에서 구현하여 사용하는 코드에서도 사용
Up-Casting
Down-Casting  -별도의 연산자가 필요 as,is 연산자

as - 변수를 호환되는 자료형으로 변환
ex)1
var a: Drink = Cola()
a as Cola // 이후로는 a는 Cola로 동작함
ex)2
var a: Drink = Cola()
var b = a as Cola // Cola로 변환한 결과를 반환받아 변수에 삽입 , 변수 자체를 다운캐스팅 시켜줌

is 변수가 자료형에 호환되는지 확인한 후 변환 ( 조건문 내에서 사용)

fun main(){
	var a = Drink()
    a.drink()
    var b : Drink = Cola()
    b.drink()

    if(b is Cola){
        b.washDishes() // is는 조건문 안에서만 잠시 다운캐스팅 됨
    }

    var c = b as Cola
    c.washDishes()
    b.washDishes()
}

open class Drink{
    var name = "음료"

    open fun drink(){
        println("${name}를 마십니다.")
    }
}

class Cola: Drink(){
    var type= "콜라"
    override fun drink(){
        println("${name}중에 ${type}를 마십니다.")
    }

    fun washDishes(){
        println("${type}으로 설거지를 합니다.")
    }
}

출력예)
음료를 마십니다.
음료중에 콜라를 마십니다.
콜라로 설거지를 합니다.
콜라로 설거지를 합니다.
콜라로 설거지를 합니다.

 */