package codewars.kyu06

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ThinkingAndTestingAxBTest {
    @Test
    fun testFixed1() {
        //Hmm.. 0 * 1 = 0
        assertEquals(0, testIt(0,1))
    }

    @Test
    fun testFixed2() {
        //Yes, 1 * 2 = 2
        assertEquals(2, testIt(1,2))
    }

    @Test
    fun testFixed3() {
        //I know, 5 * 6 = 30
        assertEquals(30, testIt(5,6))
    }

    @Test
    fun testFixed4() {
        //What? 10 * 10 = 1 ?
        assertEquals(1, testIt(10,10))
    }

    @Test
    fun testFixed5() {
        //Damn.. 200 * 200 = 4, 0 was omitted ?
        assertEquals(4, testIt(200,200))
    }

    @Test
    fun testFixed6() {
        //Discover the mysteries of it ;-)
        assertEquals(21, testIt(12,34))
    }

    @Test
    fun testFixed7() {
        //You can solve it
        assertEquals(54, testIt(123,45))
    }
}

