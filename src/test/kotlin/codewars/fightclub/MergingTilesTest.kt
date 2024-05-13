package codewars.fightclub

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MergingTilesTest {

    @Test
    fun `merge with 2 and 0`() {
        //Given
        val mergingTiles = MergingTiles()

        //When
        val givenTiles= arrayOf(2,0,2,2)

        //Then
        assertEquals(arrayOf(4,2,0,0).toList(), mergingTiles.merge(givenTiles))
    }

    @Test
    fun `merge with 4 and zero 0`() {
        //Given
        val mergingTiles = MergingTiles()

        //When
        val givenTiles= arrayOf(4,4,8,16)

        //Then
        assertEquals(arrayOf(8,8,16,0).toList(), mergingTiles.merge(givenTiles))
    }

    @Test
    fun `merge with double 8 and one 0`() {
        //Given
        val mergingTiles = MergingTiles()

        //When
        val givenTiles= arrayOf(8,8,16,0)

        //Then
        assertEquals(arrayOf(16,16,0,0).toList(), mergingTiles.merge(givenTiles))
    }

    @Test
    fun `merge with double 16 and two 0`() {
        //Given
        val mergingTiles = MergingTiles()

        //When
        val givenTiles= arrayOf(16,16,0,0)

        //Then
        assertEquals(arrayOf(32,0,0,0).toList(), mergingTiles.merge(givenTiles))
    }

    @Test
    fun `sascha mystery`() {
        //Given
        val mergingTiles = MergingTiles()

        //When
        val givenTiles= arrayOf(2,0,0,2)

        //Then
        assertEquals(arrayOf(4, 0, 0, 0).toList(), mergingTiles.merge(givenTiles))
    }

}
//Expected :[4, 0, 0, 0]
//Actual   :[2, 2, 0, 0]