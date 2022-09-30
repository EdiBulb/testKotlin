package chap3

fun main(){

}

tailrec fun binIndexOf(x: Int, array: IntArray,from:Int = 0, to: Int = array.size) : Int{
    if(from==to) return -1
    val midIndex = (from + to -1)/2
    val mid = array[midIndex]
    return when{
        mid<x -> binIndexOf(x,array,midIndex+1, to)
        mid>x -> binIndexOf(x,array,from,midIndex)
        else -> midIndex
    }
}