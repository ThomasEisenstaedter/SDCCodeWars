package codewars.kyu06

object EnoughIsEnough {
    fun deleteNth(elements: IntArray, maxOcurrences: Int) = elements
        .removeUnwantedElements(elements, maxOcurrences)
}

fun IntArray.removeUnwantedElements(elements: IntArray, maxOcurrences: Int): IntArray {
    val currentValuesInList = mutableListOf<Int>()
    elements.forEach { int ->
        if ((currentValuesInList.count { it == int }) < maxOcurrences) {
            currentValuesInList.add(int)
        }
    }
    return currentValuesInList.toIntArray()
}












object EnoughIsEnough2 {
    fun deleteNth(elements: IntArray, maxOcurrences: Int) = elements
        .filterIndexed { index, element ->
            elements.toList().subList(0, index + 1).count { it == element } <= maxOcurrences
        }.toIntArray()
}














//Daniel Knuth Lösung
object EnoughIsEnough3 {
    fun deleteNth(elements: IntArray, maxOcurrences: Int) = elements
        .filterIndexed { index, element ->
            elements.howMuchUntilNow(index, element) <= maxOcurrences
        }.toIntArray()
}

private fun IntArray.howMuchUntilNow(index: Int, element: Int) = this
    .slice(0..index)
    .count { it == element }

