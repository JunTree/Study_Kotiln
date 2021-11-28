/*
forEach
중괄호 안에서 컬렉션에 포함된 모든 아이템을 it으로 가져옴

ex)
collection.forEach{
    println(it)
}

filter
중괄호 안에서 컬렉션에 조건을 걸어 만족하는 아이템을 가져옴

ex)
collection.filter{
    it<4  // 4보다 작은 아이템만 가져옴
}

map
중괄호 안에서 it에 수식을 사용하여 값을 변경하면 컬렉션 내 아이템의 값을 변경함

ex)
collection.map{
    it*2 // 컬렉션 안의 아이템에 각 2를 곱함 일괄변경
}

collection.any{it==0} // 하나라도 조건에 맞으면 true
collection.all{it==0} // 모두 조건에 맞으면 true
collection.none{it==0} // 하나도 조건에 맞지 않으면 true

collection.first()  // 컬렉션의 첫번째 아이템 반환
collection.first{it>3} // 조건에 맞는 첫번째 아이템 반환
collection.last{it>3} // 조건에 맞는 마지막 아이템 반환

first -> find로 변경 가능
last -> findLast로 변경 가능

first , last 사용시 컬렉션이 비었거나 조건에 맞는 객체가 없다면 오류 발생 NoSuchElementException
이때, firstOrNull, lastOrNull을 사용하면 컬렉션이 비었을때 null을 반환해줌


collection.count() //포함된 모든 아이템 개수 반환
collection.count{it>7} //조건에 맞는 아이템 개수 반환


fun main(){
    val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")

    nameList.forEach{print(it + " ")}  // nameList의 모든 값들을 띄어쓰기 한칸씩 하며 출력
    println()

    println(nameList.filter{ it.startWith("김")}) // nameList의 김씨로 시작하는 값들을 출력

    println(nameList.map{"이름 : " + it}) // nameList의 값들을 이름: 값 으로 출력

    println(nameList.any{it == "김지연"}) // nameList의 값중 김지연이 하나라도 있으면 true
    println(nameList.all{it.length ==3}) // nameList의 값의 길이가 전부 3이면 true
    println(nameList.none{it.startWith("이")}) // nameList의 값중 "이"로 시작하는 단어가 없다면 true

    println(nameList.first{it.startWith("김")}) // nameList의 "김"으로 시작하는 첫번째 값 출력
    println(nameList.last{it.startWith("김")}) // nameList의 "김"으로 시작하는 마지막 값 출력
    println(nameList.count{it.contains("지")}) // nameList의 값중 "지"가 포함된 개수 출력

}
출력 예)

박수영 김지수 김다현 신유나 김지우
[김지수, 김다현, 김지우]
[이름: 박수영, 이름: 김지수, 이름: 김다현, 이름: 신유나, 이름: 김지우]
false
true
김지수
김지우
2


associateBy - 아이템에서 key를 추출하여 map으로 변환하는 함수

ex) 클래스 속성 name, birthYear
collection.associateBy{it.name} //  name이 key로 map으로 추출

groupBy - key 가 같은 아이템끼리 배열로 묶어 map으로 만드는 함수
ex) collection.groupBy{it.birthYear}

partition -  아이템에 조건을 걸어 두개의 컬렉션으로 나누어 줌
ex) collection.partition{it.birthYear > 2002}  컬렉션을 ture false에 맞춰 나눔
// Pair 클래스로 반환, 아이템을 first, second로 불러와야함


fun main(){
    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(Person("유나", 1992),
                            Person("조이", 1996),
                            Person("츄", 1999),
                            Person("유나", 2003))
    println(personList.associateBy{it.birthYear}) // birthYear을 키로 map을 형성
    println(personList.groupBy{ it.name}) // name을 키로 묶음

    val (over98, under98) = personList.pArtition {it.birthYear > 1998} // 1998보다 크면 over98(true) 작으면 under98(false)로 리스트를 나눔
    println(over98)
    println(under98)
}
출력 예)
{1992 =Person(name=유나, birthYear=1992), 1996=Person(name=조이, birthYear=1996), 1999=Person(name=츄, birthYear=1999), 2003=Person(name=유나, birthYear=2003)}
{유나=[Person(name=유나,birthYear=1992), Person(name=유나, birthYear=2003)], 조이=[Person(name=조이, birthYear=1996)], 츄=[Person(name=츄, birthYear=2003)]}
[Person(name=츄, birthYear=1999), Person(name=유나, birthYear=2003)]
[Person(name=유나, birthYear=1992), Person(name=조이, birthYear=1996)]


flatMap - 아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수

ex) collection.faltMap{
    lsitOf(it*3, it+3)// ex)[2,3] --> [6,5,9,6]
}
getOrElse - 인덱스 위치에 아이템이 있으면 아이템을, 없으면 지정한 기본값 반환하는 함수

ex) collection.getOrElse(1){50} // ex)[6,5,9,6] index1은 5
	collection.getOrElse(8){50} // ex)[6,5,9,6] index8은 없다 그러므로 기본값(중괄호안의 값) 50을 반환

zip - 컬렉션 두 개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어줌
	  pair 클래스의 객체로 만들어 리스트에 넣어 반환해줌 !! **이때 결과 list의 아이템의 갯수는 더 작은 컬렉션을 따라가게 된다. ***

ex) collectionA zip collectionB // collectionA =[a,b,c,d] collectionB= [1,2,3,4]
	pair(a,1), pair(b,2), pair(c,3), pair(d,4)


fun main(){
    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap{ listOf(it*10, it+10) }) // [(-3*10),(-3+10)...(1*10),(1+10)]

    println(numbers.getOrElse(1){50})// 1인덱스 값이 있다면 값, 없다면 50
    println(numbers.getOrElse(10){50})// 10인덱스 값이 있다면 값, 없다면 50

    val names = listOf("A","B","C","D")

    println(names zip numbers) // names의 값과 numbers의 값을 하나의 객체로 묶는다. names의 아이템갯수가 더 적으므로 4개까지만 만든다.


}

출력예)
[-30, 7, 70, 17, 20, 12, -100, 0, 10, 11]
7
50
[(A,-3), (B,7), (C,2), (D,-10)]

 */