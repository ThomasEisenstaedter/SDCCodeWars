package codewars.kyu06

fun testIt03(a: Int, b: Int): Int {
    var newA = 0
    var newB = 0

    for (ch in a.toString()) {
        newA += ch.digitToInt()
    }

    for (ch in b.toString()) {
        newB += ch.digitToInt()
    }
    return newA * newB
}

fun testIt02(a: Int, b: Int) = a.toString().map { it.digitToInt() }.sum() * b.toString().map { it.digitToInt() }
    .sum()

fun testIt(a: Int, b: Int) = a.toDigitSum() * b.toDigitSum()

fun Int.toDigitSum() = this.toString().map { it.digitToInt() }.sum()
