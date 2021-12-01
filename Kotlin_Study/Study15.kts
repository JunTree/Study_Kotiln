/*
비트연산

shl - 부호비트를 제외한 모든 비트를 좌측으로 밀어줌
shr - 부호비트를 제외한 모든 비트를 우측으로 밀어줌
ushr - 부호비트를 포함하여 모든 비트를 우측으로 밀어주는 기능

unv() - 비트를 모두 반전시킴

fun main(){
    var bitData : Int = 0b10000

    bitData = bitData or(1 shl 2)
    println(bitData.toString(2))

    var res = bitData and(1 shl 4)
    println(res.toString(2))

    println(res shr 4)

    bitData = bitData and((1 shl 4).inv())
    println(bitData.toString(2))

    println((bitData xor(0b10100)).toString(2))
}

출력예)

10100
10000
1
100
10000
 */