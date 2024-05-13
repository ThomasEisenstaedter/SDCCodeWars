package codewars.kyu06

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MultiplesOf3or5Test {
    @Test
    fun testFixed() {
        assertEquals(23, solution(10))
    }

    @Test
    fun testFixed2() {
        assertEquals(78, solution(20))
    }

    @Test
    fun testFixed3() {
        assertEquals(9168, solution(200))
    }
}