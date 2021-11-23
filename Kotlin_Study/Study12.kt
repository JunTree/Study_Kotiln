/*중첩 클래스, 내부 클래스

중첩 클래스 (Nested Class) - 하나의 클래스가 다른 클래스의 기능과강하게 연관되어 있다는 의미를 강하게 전달
						  - 두개의 클래스가 서로의 내용을 직접공유할 수 없음

class Outer{
    class Nested{

    }
}
사용시 -- 외부클래스.내부클래스()
ex) 	Outer.Nested()

중첩클래스 대신 내부 클래스 사용가능
내부클래스 - 혼자서 객체를 만들 수는 없고 외부 클래스의 객체가 있어야만 생성과 사용이 가능
 		  - 외부 클래스의 객체의 속성과 함수를 사용가능


fun main(){
   Outer.Nested().introduce()

   val outer = Outer()
   val inner = outer.Inner()

   inner.introduceInner()
   inner.introduceOuter()

   outer.text= "Changed Outer class"
   inner.introduceOuter()
}

class Outer{
    var text = "Outer class"

    class Nested{  // 중첩클래스
        fun introduce(){
            println("Nested class")
        }
    }

    inner class Inner{  // 내부클래스
        var text = "Inner class"

        fun introduceInner(){
            println(text)
        }

        fun introduceOuter(){
            println(this@Outer.text) // 클래스에 같은 이름의 속성,함수가 있다면 this@클래스이름.속성 or 함수
        }
    }
}

출력 예)
Nested class
Inner class
Outer class
Changed Outer class


특별한 클래스

Data class -데이터를 다루는데 최적화된 클래스 5가지 기능을 내부적으로 생성
1. equals()의 자동구현 - 내용의 동일성을 판단
2. hashCode()의 자동구현 - 객체의 내용에서 고유한 코드를 생성
3. toString()의 자동구현 - 포함된 속성을 보기쉽게 나타냄
4. copy()의 자동구현  	- 객체를 복사하여 똑같은 내용의 새 객체를 만듬

	아무 패러미터가 없으면 똑같은 내용으로 생성함
	val a = Data("A",7)
    val b = a.copy()
    패러미터가 있다면 해당 패러미터를 교체하여 생성함
	val a = Data("A", 7)
    val b = a.copy("B") // b 는 Data("B",7)으로 생성됨

5. componentX()의 자동구현 - 속성을 순서대로 반환
	val a = Data("A", 7) // component1()은 "A" componet2()는 7과 같이 순서대로 반환




 ***Data class 출력예 ****
fun main(){
    val a = General("보영", 212) // 일반 General 클래스의 a

    println(a == General("보영",212)) //equals() 값 확인
    println(a.hashCode()) // hashCode() 값 확인
    println(a)			// toString() 값 확인

    val b = Data("루다",306) // data class의 b

    println(b == Data("루다",306))
    println(b.hashCode())
    println(b)

    println(b.copy()) // copy값 확인
    println(b.copy("아린")) // copy값에 이름만 아린으로 바꾸고 확인
    println(b.copy(id= 618)) // named argument로 id를 618로 바꾼후 확인
}

class General(val name:String, val id: Int)

data class Data(val name:String, val id: Int)

출력 예)
false
681842940
General@28a418fc

true
46909878
Data(name=루다, id= 306)
Data(name=루다, id= 306)
Data(name=아린, id= 306)
Data(name=루다, id= 618)


***component()함수 출력 예 ***
fun main(){
   val list = listOf(Data("보영",212),
                    Data("루다",306),
                    Data("아린",618))

  for((a,b) in list) // 내부적으로 a는 component1(), b는 component2() 함수를 사용하여 순서대로 속성값을 불러옴
  {
      println("${a}, ${b}")
  }

}

class General(val name:String, val id: Int)

data class Data(val name:String, val id: Int)

출력예)
보영, 212
루다, 306
아린, 618

Enum class - Enum 클래스의 내부에 상태를 구분하기 위한 객체들을 이름을 붙여 여러개 생성해두고 그중 하나의 상태를 선택하여 나타내기 위한 클래스
			-Enum 클래스 안의 객체들은 관행적으로 상수를 나타낼 때 사용하는 대문자로 기술
			- Enum 객체들은 고유한 속성을 가질 수 있음 , 생성자를 만들어 속성을 받도록 하면 객체를 선언할 때 속성을 설정가능
			-일반 클래스처럼 함수도 추가할 수 있다., 객체의 선언이 끝나는 위치에 ;를 기술한 후 함수를 사용


fun main(){
    var state = State.SING // enum은 선언시에 만든 객체를 **이름**으로 참조하여 그대로 사용한다.
   	println(state)		// enum변수를 그대로 출력하게 되면 toString()을 통해 상태 객체의 이름이 출력

    state = State.SLEEP
    println(state.isSleeping()) // 같은 객체끼리 비교했기 때문에 true가 반환

    state = State.EAT
    println(state.message) // EAT객체의 message속성에 담긴 "밥을 먹습니다"가 출력


}

enum class State(val message: String){
    SING("노래를 부릅니다."),
    EAT("밥을 먹습니다."),
    SLEEP("잠을 잡니다."); // 함수를 사용하기 위해선 마지막 객체에 ;을 붙인다.

    fun isSleeping() = this == State.SLEEP

}

출력예)
SING
true
밥을 먹습니다.
 */