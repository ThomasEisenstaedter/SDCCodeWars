import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ToSmallestTest {
    private fun testing(n: Long, sexpect: String) {
        val sactual = ToSmallest.smallest(n).contentToString()
        assertEquals(sexpect, sactual)
    }
    @Test
    fun fixedTest1() {
        testing(261235, "[126235, 2, 0]")
    }

    @Test
    fun fixedTest2() {
        testing(209917, "[29917, 0, 1]")
    }

    @Test
    fun fixedTest3() {
        testing(285365, "[238565, 3, 1]")
    }
}
 