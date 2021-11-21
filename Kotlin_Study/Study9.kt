package com.example.KotlinStudy
/*
클래스 컬렉션 - 클래스list, 클래스set, 클래스map

클래스 list- 여러개의 데이터를 원하는 순서로 넣어관리하는 형태
List<out T> , MutableList<T> 두개존재

List<out T> - 생성시에 넣은 객체를 대체, 추가, 삭제할 수 없음
MutableList<T> - 생성시에 넣은 객체를 대체, 추가, 삭제가 가능

리스트 생성방법 -- > listOf(1,2,3) , mutableListOf("A","B","C")

요소의 추가 -- add(데이터), add(인덱스,데이터)
삭제       --	remove(데이터),removeAt(인덱스)
무작위섞기 --  shuffle()
정렬  	 -- sort()

list[인덱스] = 데이터


fun main(){
    val a = listOf("사과","딸기","배")
    println(a[1])

    for(fruit in a){
        print("${fruit}:")
    }
    println()

    val b = mutableListOf(6,3,1)
    println(b)

    b.add(4)
    println(b)

    b.add(2,8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}

출력예)
딸기
사과:딸기:배:
[6,3,1]
[6,3,1,4]
[6,3,8,1,4]
[6,8,1,4]
[6,4,8,1]
[1,4,6,8]

문자열 함수.


fun main(){
    val test1 = "Test.Kotlin.String"

    println(test1.length) //문자열 길이

    println(test1.toLowerCase())// 소문자로 변환
    println(test2.toUpperCase())// 대문자로 변환

    var test2 = test1.split(".") // .을기준으로 나눔
    println(test2)

    println(test2.joinToString()) // 문자열을 그냥 합침
    println(test2.joinToString("-")) // -을 넣어서 합쳐짐

    println(test1.substring(5..10)) // 문자열 이부분만 사용 5부터 10까지
}

출력 예)
18
test.kotlin.string
TEST.KOTLIN.STRING
[Test, Kotlin, String]
Test, Kotlin, String
Test-Kotlin-String
Kotiln

fun main(){
    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"

    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty()) // 널이거나 비어있다면 True를 반환, 공백 문자열은 false

    println()

    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank()) // 널이거나 비어있다면 True를 반환, 공백문자열도 True


}

출력예)
true
true
false
false

true
true
true
false

fun main(){
    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))// 지정한 문자열로 시작하면 True를 반환
    println()
    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt")) // 지정한 문자열로 끝나면 True를 반환
    println()
    println(test3.contains("lin"))
    println(test4.contains("lin")) // 지정한 문자열이 포함되어 있으면 True를 반환
}

출력예)
false
true

true
false

true
false




 */