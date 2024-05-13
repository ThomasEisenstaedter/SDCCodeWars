package codewars.kyu05.rgbtohexconversion

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RGBToHexConversionTest {
    @Test
    fun testFixed() {
        assertEquals("000000", rgb(0, 0, 0))
    }

    @Test
    fun testFixed1() {
        assertEquals("000000", rgb(0, 0, -20))
    }

    @Test
    fun testFixed2() {
        assertEquals("FFFFFF", rgb(300,255,255))
    }

    @Test
    fun testFixed3() {
        assertEquals("ADFF2F", rgb(173,255,47))
    }

    @Test
    fun testFixed4() {
        assertEquals("9400D3", rgb(148, 0, 211))
    }
}
