package codewars.fightclub

class MergingTiles {

    private val result: MutableList<Int> = mutableListOf()

    fun merge(givenTiles: Array<Int>): List<Int> {
        givenTiles.forEach { e -> if (e != 0) result.add(e) }
        var comparedIndex = 1

        (0..<result.size - 1).forEach { index ->
            if (result.isZeroAndNotLastIndex(comparedIndex)) {
                result[comparedIndex] = result[comparedIndex + 1]
                result[comparedIndex + 1] = 0
            }

            if (result.doComparedIndicesMatch(index, comparedIndex)) {
                result[index] = result[index] + result[comparedIndex]
                result[comparedIndex] = 0
            }
            comparedIndex++
        }

        while (result.size < givenTiles.size) {
            result.add(0)
        }

        for (index in givenTiles.indices) {
            if (result[index] == 0 && result.nextIndexIsInRange(index)) {
                result[index] = result[index + 1]
                result[index + 1] = 0
            }
        }

        return result
    }

    private fun List<Int>.isZeroAt(comparedIndex: Int) = this[comparedIndex] == 0

    private fun List<Int>.nextIndexIsInRange(comparedIndex: Int) = comparedIndex + 1 < this.size

    private fun List<Int>.doComparedIndicesMatch(index: Int, comparedIndex: Int) =
        this[index] == (this[comparedIndex])

    private fun List<Int>.isZeroAndNotLastIndex(comparedIndex: Int) =
        this.isZeroAt(comparedIndex) && this.nextIndexIsInRange(comparedIndex)

}
