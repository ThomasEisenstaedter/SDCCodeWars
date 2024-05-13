package tdd_intro


class Set {

    private var size = 0
    private var setArray: Array<Int> = arrayOf(0, 0, 0)

    fun isEmpty() = size == 0

    fun add(number: Int) {
        if (!contains(number)) {
            setArray[size] = number
            size++
        }
    }

    fun count(): Int = this.size

    fun contains(searchedNumber: Int) = this.indexOfOrMinus(searchedNumber) != -1

    fun remove(numberToBeRemoved: Int) {
        val foundIndex = this.indexOfOrMinus(numberToBeRemoved)
        if (foundIndex != -1) {
            this.setArray[foundIndex] = this.setArray[size]
            size--
        }
    }

    private fun indexOfOrMinus(element: Int) = (0..<this.size).firstOrNull { setArray[it] == element } ?: -1

}
