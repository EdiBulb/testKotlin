fun main1(args: Array<String>){
    if(args.isNotEmpty()){
        val message = "Hello, ${args[0]}"
        println(message)
    }else{
        println()
    }
}

fun max(a:Int,b:Int) = if(a>b) a else b

fun main(){
    val num = readLine()!!.toInt()

    println(num in 10..99)
}