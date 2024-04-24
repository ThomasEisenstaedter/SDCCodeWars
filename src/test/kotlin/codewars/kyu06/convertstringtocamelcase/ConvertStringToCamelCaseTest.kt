package codewars.kyu06.convertstringtocamelcase
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ConvertStringToCamelCaseTest {
    @Test
    fun testFixed() {
        assertEquals("", toCamelCase(""))
    }

    @Test
    fun testFixed1() {
        assertEquals("theStealthWarrior", toCamelCase("the_stealth_warrior"))
    }

    @Test
    fun testFixed2() {
        assertEquals("TheStealthWarrior", toCamelCase("The-Stealth-Warrior"))
    }

    @Test
    fun testFixed3() {
        assertEquals("ABC", toCamelCase("A-B-C"))
    }
}