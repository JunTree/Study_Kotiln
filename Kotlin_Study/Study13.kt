/*
Set Map

Set - 순서가 정렬되지 않고 중복이 허용되지 않음 , 인덱스로 객체 참조 불가능
	add 추가 , remove 삭제

fun main(){
    val a =mutableSetof("귤", "바나나", "키위")

    for(item in a){

        println("${item}")
    }

    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))
}

출력 예)
귤
바나나
키위
[귤,바나나,키위,자몽]
[귤,키위,자몽]
true


Map- 객체를 찾을 수 있는 key를 쌍으로 넣어주는 것. 고유한 키를 통해 객체를 참조
	put 추가 , remove 삭제  , key to value

fun main(){
    val a =mutableMapOf("레드벨벳" to "음파음파",
                       "트와이스" to "FANCY",
                       "ITZY" to "ICY")

    for(entry in a){

        println("${entry.key} : ${entry.value}")
    }

    a.put("오마이걸", "번지")
    println(a)

    a.remove("ITZY")
    println(a)

    println(a["레드벨벳"])
}

출력 예)
레드벨벳 : 음파음파
트와이스 : FANCY
ITZY : ICY
{레드벨벳 = 음파음파 , 트와이스 = FANCY, ITZY = ICY, 오마이걸 = 번지}
{레드벨벳 = 음파음파 , 트와이스 = FANCY, 오마이걸 = 번지}
음파음파

 */