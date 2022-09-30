package chap4

fun sayHello(name: String?){
    println("Hello, "+(name ?: "Unknown"))
}

fun main(){
    sayHello("John")
    sayHello(null)
}