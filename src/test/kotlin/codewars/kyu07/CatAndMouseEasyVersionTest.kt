package codewars.kyu07

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CatAndMouseEasyVersionTest {

    @Test
    fun basicTests() {
        assertEquals("Escaped!", catMouse("C....m"))
        assertEquals("Caught!", catMouse("C..m"))
        assertEquals("Escaped!", catMouse("C.....m"))
        assertEquals("Caught!", catMouse("C.m"))
    }
}