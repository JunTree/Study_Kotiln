/*
?. - null safe operator
참조 연산자를 실행하기 전에 먼저 객체가 null인지 확인하고 null이라면 구문을 실행하지 않음
ex) sample?.toUpperCase() // sample이 null이면 toUpperCase()구문을 실행하지 않음

?: - elvis operator
객체가 null이 아니라면 그대로 사용하지만 null이라면 연산자 우측의 객체로 대체됨
ex) sample?: "default" // sample이 null이면 "default"값으로 대체됨

!!. - non-null assertion operator
참조연산자를 사용할때 null여부를 컴파일시 확인하지 않도록 하여 런타임시 의도적으로 null pointer exception이 나도록 의도적으로 방치하는 연산자





fun main(){
    var a: String? = null

    println(a?.toUpperCase())

    println(a?:"default".toUpperCase())

    println(a!!.toUpperCase())

}

출력예)
null
DEFAULT
널포인터 익셉션 오류뜸

fun main(){
    var a: String? = null

    a?.run{  					//if문 대신에 null값을 **null safe operator**와 스코프함수 **run**으로 체크하게 되면 상당히 편리
        println(toUpperCase())
        println(toLowerCase())
    }

}

출력예)
a가 널이기 때문에 스코프함수가 실행되지 않는다

fun main(){
    var a: String? = "Kotlin Exam"

    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    }

}

출력예)
KOTLIN EXAM
kotlin exam


변수의 동일성을 체크

내용의 동일성 - 메모리상의 서로 다른 곳에 할당된 객체여도 내용이 같다면 같음
ex ) a==b

객체의 동일성 - 서로다른 객체가 메모리상의 같은 곳을 가르키고 있다면 객체가 동일
ex ) a===b


fun main(){
    var a = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    val c = a
    var d = Product("사이다", 1000)

    println(a == b)
    println(a === b)

    println(a == c)
    println(a === c)

    println(a == d)
    println(a === d)

}

class Product(val name: String, val price: Int){
    override fun equlas(other: Any?): Boolean{
        if(other is Product){ //패러미터(other)로 넘어온 객체가 Product라면..
            return other.name == name && other.price == price
        }else{
            return false
        }
    }
}

출력예)
true
false
true
true
false
false

 .*/