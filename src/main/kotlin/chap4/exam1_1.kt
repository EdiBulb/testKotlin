package chap4

class Person{
    var firstName : String =""
    var familyName : String = ""
    var age : Int = 0

    fun fullName() = "$firstName $familyName"

    fun showMe(){
        println("${fullName()}: $age")
    }

    //this를 사용하는 경우 에시
    fun fullName2() = "${this.firstName} ${this.familyName}"
    fun showMe2(){
        println("${this.fullName2()}:${this.age}")
    }


    //this를 꼭 써야하는 경우 - 클래스의 프로퍼티와 메서드 파라미터의 이름이 같은 경우우
    fun setName(firstName:String, familyName:String){
        this.firstName = firstName
        this.familyName = familyName
    }
}

fun main(){
    fun showAge(p:Person) = println(p.age)

    fun readAge(p:Person){
        p.age = readLine()!!.toInt()//프로퍼티에 쓰기
    }

    fun showFullName(p:Person) = println(p.fullName())//메서드를 호출한다.

    val person = Person()//Person 인스턴스 생성한다.

    person.firstName = "John"
    person.familyName = "Doe"
    person.age = 25

    person.showMe()
}
