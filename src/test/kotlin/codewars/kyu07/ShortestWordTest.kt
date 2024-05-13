package codewars.kyu07

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ShortestWordTest {
    @Test
    fun testFixed() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
    }

    @Test
    fun testFixed1() {
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
    }

    @Test
    fun testFixed2() {
        assertEquals(2, findShort("Let's travel abroad shall we"))
    }

}
