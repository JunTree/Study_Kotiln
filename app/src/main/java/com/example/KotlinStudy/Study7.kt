/*
옵저버 패턴
이벤트가 일어날 때 반응하는 패턴
ex) 키가 입력 ,데이터가 들어옴

이벤트 수신클래스, 이벤트 발생 및 전달클래스 2개가 필요
callback - 이벤트를 넘겨주는 행위
인터페이스 -  이벤트가 발생하는 클래스에서 수신하는 클래스를 참조할때 사용하는 것 리스너(listener라고 함 )또는 옵저버라고함

fun main(){
    Eventprinter().start()
}

interface Eventlistener{
    fun onEvent(cnt: Int)
}
class Counter(var listener: Eventlistener){
    fun count(){
        for(i in 1..100){
            if(i%5 ==0) listener.onEvent(i)
        }
    }
}

class Eventprinter: Eventlistener{
    override fun onEvent(cnt:Int){
        print("${cnt}-")
    }
    fun start(){
        val counter = Counter(this)
        counter.count()
    }
}

출력예) 5-10-15...-95-100-

익명 객체

fun main(){
    Eventprinter().start()
}

interface Eventlistener{
    fun onEvent(cnt: Int)
}
class Counter(var listener: Eventlistener){
    fun count(){
        for(i in 1..100){
            if(i%5 ==0) listener.onEvent(i)
        }
    }
}

class Eventprinter{
    fun start(){
        val counter = Counter(object: Eventlistener{
            override fun onEvent(count: Int){
                print("{$count}-")
            }
        })
        counter.count()
    }
}


출력예) 5-10-15...-95-100-


 .*/