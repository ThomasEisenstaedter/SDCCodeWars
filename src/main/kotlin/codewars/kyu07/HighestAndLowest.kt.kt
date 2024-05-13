package codewars.kyu07

//INPUT:
//In this little assignment you are given a string of space separated numbers, and have to return the highest and
//lowest number.
//
//Examples
//
//highAndLow("1 2 3 4 5")  // return "5 1"
//highAndLow("1 2 -3 4 5") // return "5 -3"
//highAndLow("1 9 3 4 -5") // return "9 -5"
//
//Notes
//
//All numbers are valid Int32, no need to validate them.
//There will always be at least one number in the input string.
//Output string must be two numbers separated by a single space, and highest number is first.
//
//fun highAndLow(numbers: String): String {
//    // ...
//    return ""
//}



//BestPractice01
fun highAndLow01(numbers: String): String
{
    val x = numbers.split(" ").map { it.toInt() }.sorted()
    return "${x.last()} ${x.first()}"
}

//BestPractice02
fun highAndLow02(numbers: String) =
    numbers.split(" ").map { it.toInt() }.run {
        "${this.maxOrNull()} ${this.minOrNull()}"
    }

fun highAndLow(numbers: String) = getHighestAndLowest(
        numbers.split(" ").map { it.toInt() }.sortedDescending())

private fun getHighestAndLowest(list: List<Int>): String {
    val first = list[0].toString()
    val second = list[list.size-1].toString()
    return "${first}${" "}${second}"
}
