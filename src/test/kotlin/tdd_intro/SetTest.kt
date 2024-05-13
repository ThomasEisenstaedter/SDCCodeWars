package tdd_intro

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SetTest {

    @Test
    fun `is empty`() {

        // Given
        val testSet = Set()

        // When

        //Then
        assertTrue(testSet.isEmpty())

    }

    @Test
    fun `has at least one number`() {

        // Given
        val testSet = Set()

        // When
        testSet.add(1)

        // Then
        assertFalse(testSet.isEmpty())
    }

    @Test
    fun `counts containing elements`() {

        // Given
        val testSet = Set()

        // When
        testSet.add(1)
        testSet.add(3)

        // Then
        assertEquals(2, testSet.count())
    }

    @Test
    fun `contains a specific number`() {

        // Given
        val testSet = Set()

        // When
        testSet.add(3)

        // Then
        assertTrue(testSet.contains(3))
        assertFalse(testSet.contains(9))
    }


    @Test
    fun `contains only unique numbers`() {

        // Given
        val testSet = Set()
        testSet.add(3)

        // When
        testSet.add(3)

        // Then
        assertEquals(1, testSet.count())
    }

    @Test
    fun `removes given number`() {

        // Given
        val testSet = Set()
        testSet.add(3)

        // When
        testSet.remove(3)

        // Then
        assertFalse(testSet.contains(3))
        assertFalse(testSet.contains(0))
    }


}