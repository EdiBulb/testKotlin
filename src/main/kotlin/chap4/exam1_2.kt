package chap4

class Person2(fullName:String){

    val firstName: String
    val familyName:String
    //init 초기화 블록
    init {
        val names = fullName.split(" ")
        if(names.size!=2){
            throw java.lang.IllegalArgumentException("Invalid name: $fullName")
        }
        firstName = names[0]
        familyName = names[1]
    }
}

fun main(){
    val person = Person2("John Doe")
    println(person.firstName)
}