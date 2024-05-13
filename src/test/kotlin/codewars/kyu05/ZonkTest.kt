package codewars.kyu05

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Example tests")
class ZonkTest {
    @Test
    @DisplayName("Single dice 1")
    fun test1() {
        doTest(intArrayOf(1), 100)
    }

    @Test
    @DisplayName("Single dice 2")
    fun test2() {
        doTest(intArrayOf(2), 0)
    }

    @Test
    @DisplayName("Single dice 3")
    fun test3() {
        doTest(intArrayOf(3), 0)
    }

    @Test
    @DisplayName("Single dice 4")
    fun test4() {
        doTest(intArrayOf(4), 0)
    }

    @Test
    @DisplayName("Single dice 5")
    fun test5() {
        doTest(intArrayOf(5), 50)
    }

    @Test
    @DisplayName("Single dice 6")
    fun test6() {
        doTest(intArrayOf(6), 0)
    }


    @Test
    @DisplayName("Multiple dice 1")
    fun test7() {
        doTest(intArrayOf(1, 1), 200)
    }

    @Test
    @DisplayName("Multiple dice 2")
    fun test8() {
        doTest(intArrayOf(1, 1, 1), 1000)
    }

    @Test
    @DisplayName("Multiple dice 3")
    fun test9() {
        doTest(intArrayOf(1, 2, 3, 4, 5, 6), 1000)
    }

    @Test
    @DisplayName("Multiple dice 4")
    fun test10() {
        doTest(intArrayOf(2, 2, 3, 3, 6, 6), 750)
    }

    @Test
    @DisplayName("Multiple dice 5")
    fun test11() {
        doTest(intArrayOf(3, 2, 6, 4, 4, 6), 0)
    }

    @Test
    @DisplayName("Multiple dice - Three of a kind")
    fun test12() {
        doTest(intArrayOf(4, 4, 4, 3, 5, 6), 450)
    }

    @Test
    @DisplayName("Multiple dice - 2x Three of a kind")
    fun test13() {
        doTest(intArrayOf(4, 6, 4, 6, 4, 6), 1000)
    }

    @Test
    @DisplayName("Multiple dice - Three pairs of a kind")
    fun test14() {
        doTest(intArrayOf(2, 2, 4, 4, 6, 6), 750)
    }

    @Test
    @DisplayName("Multiple dice - Four of a kind")
    fun test15() {
        doTest(intArrayOf(1, 1, 1, 1, 4, 6), 2000)
    }

    @Test
    @DisplayName("Multiple dice - Five of a kind")
    fun test16() {
        doTest(intArrayOf(5, 5, 5, 4, 5, 5), 1500)
    }

    @Test
    @DisplayName("Multiple dice - Six of a kind")
    fun test17() {
        doTest(intArrayOf(4, 4, 4, 4, 4, 4), 1600)
    }

    @Test
    @DisplayName("Multiple dice - Award all the 1s")
    fun test18() {
        doTest(intArrayOf(1, 4, 1, 2, 6, 4), 200)
    }

    @Test
    @DisplayName("Multiple dice - Award all the 5s")
    fun test19() {
        doTest(intArrayOf(5, 4, 5, 2, 6, 4), 100)
    }

    @Test
    @DisplayName("Multiple dice - Only 1s and 5s on three dice")
    fun test20() {
        doTest(intArrayOf(1, 1, 5), 250)
    }

    @Test
    @DisplayName("Multiple dice - Only 1s and 5s on four dice")
    fun test21() {
        doTest(intArrayOf(1, 5, 5, 1), 300)
    }

    @Test
    @DisplayName("Multiple dice - Only 1s and 5s on five dice")
    fun test22() {
        doTest(intArrayOf(1, 5, 1, 5, 1), 1100)
    }

    @Test
    @DisplayName("Multiple dice - Only 1s and 5s on five dice II")
    fun test23() {
        doTest(intArrayOf(5, 6, 5, 1, 4), 200)
    }

    @Test
    @DisplayName("Multiple dice - Straight")
    fun test24() {
        doTest(intArrayOf(6, 3, 1, 2, 5, 4), 1000)
    }

    @Test
    @DisplayName("Multiple dice - Four 1s")
    fun test25() {
        doTest(intArrayOf(1, 1, 1, 1), 2000)
    }

    @Test
    @DisplayName("Multiple dice - Three pairs")
    fun test26() {
        doTest(intArrayOf(1, 5, 2, 1, 2, 5), 750)
    }

    @Test
    @DisplayName("Multiple dice - Straight")
    fun test27() {
        doTest(intArrayOf(3, 4, 1, 1, 1, 4), 1000)
    }

    @Test
    @DisplayName("Multiple dice - Four 2s + 5")
    fun test28() {
        doTest(intArrayOf(2, 2, 2, 2, 4, 5), 450)
    }


    private fun doTest(dice: IntArray, expected: Int) {
        assertEquals(expected, getScore(dice), "(" + dice.joinToString() + ")")
    }
}