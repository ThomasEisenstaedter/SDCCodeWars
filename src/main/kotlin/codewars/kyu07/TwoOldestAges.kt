package codewars.kyu07

fun twoOldestAges1(ages: List<Int>): List<Int> {
    return listOf(ages.sortedDescending().get(1), ages.sortedDescending().get(0))
}

fun twoOldestAges2(ages: List<Int>): List<Int> {
    return listOf(ages.sortedDescending()[1], ages.sortedDescending()[0])
}
fun twoOldestAges(ages: List<Int>): List<Int> = ages
    .sorted()
    .subList(ages.size - 2, ages.size)


fun twoOldestAges3(ages: List<Int>): List<Int> {
    return ages
        .sorted()
        .subList(ages.size - 2, ages.size)
}

fun twoOldestAgesMichelle(ages: List<Int>): List<Int> = ages
    .sortedDescending().subList(0, 2)
    .reversed()

fun twoOldestAgesDani(ages: List<Int>): List<Int> = ages
    .sorted()
    .takeLast(2)
