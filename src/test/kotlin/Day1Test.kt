import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class Day1Test {
    @Test
    fun `Example for part one`(){
        val input = "1000\n" +
                "2000\n" +
                "3000\n" +
                "\n" +
                "4000\n" +
                "\n" +
                "5000\n" +
                "6000\n" +
                "\n" +
                "7000\n" +
                "8000\n" +
                "9000\n" +
                "\n" +
                "10000"
        Day1.partOne(input) `should be equal to` 24000
    }
    @Test
    fun `Example for part two`(){
        val input = "1000\n" +
                "2000\n" +
                "3000\n" +
                "\n" +
                "4000\n" +
                "\n" +
                "5000\n" +
                "6000\n" +
                "\n" +
                "7000\n" +
                "8000\n" +
                "9000\n" +
                "\n" +
                "10000"
        Day1.partTwo(input) `should be equal to` 45000
    }
}