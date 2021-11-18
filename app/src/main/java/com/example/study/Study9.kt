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


 */