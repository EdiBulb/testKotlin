import kotlin.random.Random

fun main(){
    fun countLetters(text: String):IntArray{
        val counts = IntArray('z'-'a'+1)

        for(char in text){
            val charLower = char.toLowerCase()
            if(charLower !in 'a'..'z')continue
            counts[charLower - 'a']++
        }
        return counts
    }

}

fun indexOf(subarray: IntArray, array: IntArray):Int{
    outerLoop@ for(i in array.indices){
        for(j in subarray.indices){
            if(subarray[j] != array[i+j])continue@outerLoop
        }
        return  i
    }
    return -1
}