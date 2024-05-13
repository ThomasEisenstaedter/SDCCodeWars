package codewars.kyu07

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PlusMinus_PlusPlusCountTest {
    @Test
    fun testFixed01() {
        assertEquals(0, catchSignChange(arrayOf(1, 3, 4, 5)));
    }

    @Test
    fun testFixed02() {
        assertEquals(0, catchSignChange(arrayOf<Int>()));
    }

    @Test
    fun testFixed03() {
        assertEquals(2, catchSignChange(arrayOf(1, -3, -4, 0, 5)));
    }

    @Test
    fun testFixed04() {
        assertEquals(3, catchSignChange(arrayOf(-47,84,-30,-11,-5,74,77)));
    }
}
