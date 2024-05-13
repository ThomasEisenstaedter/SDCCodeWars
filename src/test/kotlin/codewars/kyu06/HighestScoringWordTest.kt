package codewars.kyu06

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HighestScoringWordTest {
    @Test
    fun testFixed01() {
        assertEquals("taxi", high("man i need a taxi up to ubud"))
    }

    @Test
    fun testFixed02() {
        assertEquals("volcano", high("what time are we climbing up the volcano"))
    }

    @Test
    fun testFixed03() {
        assertEquals("semynak", high("take me to semynak"))
    }

    @Test
    fun testFixed04() {
        assertEquals("aa", high("aa b"))
    }

    @Test
    fun testFixed05() {
        assertEquals("b", high("b aa"))
    }

    @Test
    fun testFixed06() {
        assertEquals("bb", high("bb d"))
    }

    @Test
    fun testFixed07() {
        assertEquals("d", high("d bb"))
    }

    @Test
    fun testFixed08() {
        assertEquals("aaa", high("aaa b"))
    }


}
