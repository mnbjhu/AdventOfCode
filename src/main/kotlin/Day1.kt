
object Day1: Solution(1){
    override fun partOne(input: String): Int?{
        return input
            .split("\n\n+".toRegex())
            .maxOfOrNull { it.split("\n").sumOf(String::toInt) }
    }

    override fun partTwo(input: String): Any? {
        return input
            .split("\n\n+".toRegex())
            .map { it.split("\n").sumOf(String::toInt) }
            .sortedDescending()
            .take(3)
            .sum()
    }
}
