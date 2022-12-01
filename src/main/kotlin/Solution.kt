import io.ktor.client.request.*
import io.ktor.client.statement.*

abstract class Solution(private val day: Int) {
    suspend fun getAnswerPartOne(){
        val text = client.get("https://adventofcode.com/2022/day/$day/input").bodyAsText()
        println(partOne(text.trim()))
    }
    suspend fun getAnswerPartTwo(){
        val text = client.get("https://adventofcode.com/2022/day/$day/input").bodyAsText()
        println(partTwo(text.trim()))
    }
    abstract fun partOne(input: String): Any?
    open fun partTwo(input: String): Any? = null
}