package codewars.kyu05

fun productFib(prod: Long) = prod.findConsecutives()

fun Long.findConsecutives(): LongArray {
    var product = 0L
    var firstFib = 0L
    var secondFib = 1L
    while (firstFib * secondFib < this) {
        val temp = secondFib
        secondFib = longArrayOf(firstFib, secondFib).calculateNextFib()
        firstFib = temp
        product = firstFib * secondFib
    }

    val boolean1 = if (product == this) 1L else 0L
    return longArrayOf(firstFib, secondFib, boolean1)
}

fun LongArray.calculateNextFib() = this[0] + this[1]
