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


 */