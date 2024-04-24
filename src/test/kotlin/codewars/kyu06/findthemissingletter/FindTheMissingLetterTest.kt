package codewars.kyu06.findthemissingletter

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FindTheMissingLetterTest {

    @Test
    fun exampleTests() {
        assertEquals('e', findMissingLetter(charArrayOf('a', 'b', 'c', 'd', 'f')))
        assertEquals('P', findMissingLetter(charArrayOf('O', 'Q', 'R', 'S')))
    }
}