fun main(array: Array<String>) {
    val testCase1 = 285365
    println(testCase1)
    val testCase1Shortest = transformWholeNumberToSmallestPossible(testCase1.toString())
    println(testCase1Shortest)
    println(transformNumberByChangingOneDigit(testCase1.toString(), testCase1Shortest).contentToString())
    println("Should be 238565")
}

object ToSmallest {
    fun smallest(n: Long): LongArray {
        return transformNumberByChangingOneDigit(n.toString(), transformWholeNumberToSmallestPossible(n.toString()))
    }
}

private fun transformWholeNumberToSmallestPossible(numberAsString: String): String {
    return numberAsString.split("").sorted().joinToString("") { e -> e.toString() }
}

private fun transformNumberByChangingOneDigit(inputNumberAsString: String, testCase1Shortest: String): LongArray {
    var indexOld = inputNumberAsString.length-1
    val indexNew = if (testCase1Shortest[0].digitToInt() == 0 || inputNumberAsString[0] == testCase1Shortest[0]) {
        1
    } else {
        0
    }

    for (i in inputNumberAsString.indices) {
        if (testCase1Shortest[indexNew] == inputNumberAsString[i]) {
            indexOld = i
            println("index old is: $indexOld and input was $inputNumberAsString")
        }
    }

    if (testCase1Shortest.contains("0")) {
        indexOld = 0
    }
    val newList = inputNumberAsString.split("").toMutableList()

    println("List before")
    println( longArrayOf(newList.joinToString("") { e -> e }.toLong(), indexOld.toLong(), indexNew.toLong()).contentToString())
    newList.remove("0")
    println("Index new is: $indexNew")

    if (inputNumberAsString[0] == testCase1Shortest[0]) {
        println("List inbetween")
        println( longArrayOf(newList.joinToString("") { e -> e }.toLong(), indexOld.toLong(), indexNew.toLong()).contentToString())
        newList[indexNew] = inputNumberAsString[indexOld].toString()
    } else {
            newList.remove(inputNumberAsString[indexOld].toString())
            newList[0] = inputNumberAsString[indexOld].toString()
    }
    println("List after2")
    println( longArrayOf(newList.joinToString("") { e -> e }.toLong(), indexOld.toLong(), indexNew.toLong()).contentToString())


    return longArrayOf(newList.joinToString("") { e -> e }.toLong(), indexOld.toLong(), indexNew.toLong())
}