package chap3

import java.awt.Point

fun main(){
    class Point(val x:Int, val y:Int){
        fun shift(dx: Int,dy :Int):Point = Point(x+dx, y+dy)
        override fun toString() = "($x,$y)"
    }

    val p = Point(10,10)
    println(p.shift(-1,3))
}

fun foo(){
    println(Point(0,0))
}

