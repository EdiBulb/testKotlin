fun rectangleArea(width: Double, height: Double): Double{
    return width*height
}

//두 문자를 서로 교환하는 함수
fun swap(s:String, from: Int, to:Int):String{
    val chars = s.toCharArray()

    val tmp=chars[from]
    chars[from] = chars[to]
    chars[to]=tmp
    return chars.concatToString()//문자열로 다시 변환

}

fun main(){
//    val w = readLine()!!.toDouble()
//    val h = readLine()!!.toDouble()
//    println("Rectangle area: ${rectangleArea( height = h,width = w)}")


}