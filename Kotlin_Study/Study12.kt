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

 */