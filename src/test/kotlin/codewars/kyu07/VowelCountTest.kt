package codewars.kyu07

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class VowelCountTest {

    @Test
    fun testGetCount() {

        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}