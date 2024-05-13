package codewars.kyu06

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MexicanWaveTest

class TestKata {
    @Test
    fun basicTests01() {
        assertEquals(listOf("A       b    ", "a       B    ")
            , wave("a       b    "))
    }

    @Test
    fun basicTests02() {
        assertEquals(
            listOf(
                "This is a few words",
                "tHis is a few words",
                "thIs is a few words",
                "thiS is a few words",
                "this Is a few words",
                "this iS a few words",
                "this is A few words",
                "this is a Few words",
                "this is a fEw words",
                "this is a feW words",
                "this is a few Words",
                "this is a few wOrds",
                "this is a few woRds",
                "this is a few worDs",
                "this is a few wordS"
            ), wave("this is a few words")
        )
    }

    @Test
    fun basicTests03() {
        assertEquals(listOf<String>(), wave(""))
    }

    @Test
    fun basicTests04() {
        assertEquals(listOf(" Gap ", " gAp ", " gaP "), wave(" gap "))
    }
}