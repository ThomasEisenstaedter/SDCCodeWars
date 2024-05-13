package codewars.kyu05

fun getScore(dice: IntArray) = dice.possCombs()

fun IntArray.possCombs(): Int {
    return when (this.size) {
        1, 2 -> this.oneOrTwoDiceHaveBeenThrown()
        3 -> this.threeDiceHaveBeenThrown()
        4 -> this.fourDiceHaveBeenThrown()
        5 -> this.fiveDiceHaveBeenThrown()
        6 -> this.sixDiceHaveBeenThrown()
        else -> 0
    }
}

fun IntArray.oneOrTwoDiceHaveBeenThrown(): Int = listOf(
    this.award100PointsForEvery1(),
    this.award50PointsForEvery5()
).sum()

fun IntArray.threeDiceHaveBeenThrown(): Int = listOf(
    this.award100PointsForEvery1() + this.award50PointsForEvery5(),
    this.checkIfXOfAKind(3, 1)
).max()

fun IntArray.fourDiceHaveBeenThrown(): Int = listOf(
    this.award100PointsForEvery1() + this.award50PointsForEvery5(),
    this.checkIfThreeOfAKindPlus1sOr5s(),
    this.checkIfXOfAKind(4, 2)
).max()

fun IntArray.fiveDiceHaveBeenThrown(): Int = listOf(
    this.award100PointsForEvery1() + this.award50PointsForEvery5(),
    this.checkIfThreeOfAKindPlus1sOr5s(),
    this.checkIfFourOfAKindPlus1sOr5s(),
    this.checkIfXOfAKind(4, 2),
    this.checkIfXOfAKind(5, 3)
).max()

fun IntArray.sixDiceHaveBeenThrown(): Int {
    val possCombs = mutableListOf<Int>()
    if (this.sorted().toIntArray().contentEquals(intArrayOf(1, 2, 3, 4, 5, 6))) {
        possCombs.add(1000)
    }
    possCombs.add(this.award100PointsForEvery1() + this.award50PointsForEvery5())
    possCombs.add(this.checkIfThreePairsOfAKind())
    possCombs.add(this.checkIfThreeOfAKindPlus1sOr5s())
    possCombs.add(this.checkIfFourOfAKindPlus1sOr5s())
    possCombs.add(this.checkIfFiveOfAKindPlus1sOr5s())
    possCombs.add(this.checkIfXOfAKind(4, 2))
    possCombs.add(this.checkIfXOfAKind(5, 3))
    possCombs.add(this.checkIfXOfAKind(6, 4))
    return possCombs.max()
}

fun IntArray.checkIfThreePairsOfAKind(): Int =
    if (this.groupBy { it }.filter { it.value.count() > 1 }.keys.size == 3) {
        750
    } else {
        0
    }

fun IntArray.checkIfXOfAKind(seriesOf: Int, multiplikator: Int): Int = (1..6)
    .filter { this.numContainsSeriesXOfTypeY(seriesOf, it) }
    .sumOf { multiplikator * it.multiplier() }

private fun Int.multiplier(): Int = if (this == 1) {
    1000
} else {
    this * 100
}

fun IntArray.award100PointsForEvery1() = this.count { it == 1 } * 100

fun IntArray.award50PointsForEvery5() = this.count { it == 5 } * 50

private fun IntArray.checkIfThreeOfAKindPlus1sOr5s() = when {
    this.numContainsSeriesXOfTypeY(3, 1) -> (this.checkIfXOfAKind(3, 1) + this.award50PointsForEvery5())
    this.numContainsSeriesXOfTypeY(3, 5) -> (this.checkIfXOfAKind(3, 1) + this.award100PointsForEvery1())
    else -> (this.checkIfXOfAKind(3, 1) + this.award100PointsForEvery1() + this.award50PointsForEvery5())
}

fun IntArray.checkIfFourOfAKindPlus1sOr5s() = when {
    this.numContainsSeriesXOfTypeY(4, 1) -> (this.checkIfXOfAKind(4, 2) + this.award50PointsForEvery5())
    this.numContainsSeriesXOfTypeY(4, 5) -> (this.checkIfXOfAKind(4, 2) + this.award100PointsForEvery1())
    else -> (this.checkIfXOfAKind(4, 2) + this.award100PointsForEvery1() + this.award50PointsForEvery5())
}

fun IntArray.checkIfFiveOfAKindPlus1sOr5s() = when {
    this.numContainsSeriesXOfTypeY(5, 1) -> (this.checkIfXOfAKind(5, 3) + this.award50PointsForEvery5())
    this.numContainsSeriesXOfTypeY(5, 5) -> (this.checkIfXOfAKind(5, 3) + this.award100PointsForEvery1())
    else -> (this.checkIfXOfAKind(5, 3) + this.award100PointsForEvery1() + this.award50PointsForEvery5())
}

fun IntArray.numContainsSeriesXOfTypeY(seriesOfToBeChecked: Int, typeOf: Int) = this
    .groupBy { it }
    .filter { it.value.count() == seriesOfToBeChecked }
    .keys.contains(typeOf)