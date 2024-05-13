package codewars.kyu06

fun solution(number: Int): Int {
    var tempList = mutableListOf<Int>()
    for (currentNumber in 0..<number) {
        if (currentNumber * 3 < currentNumber) {
            tempList.add(currentNumber)
        }

        if (currentNumber * 5 < currentNumber) {
            tempList.add(currentNumber)
        }
    }
    return tempList.toSet().sum()
}

fun solution2(number: Int) = (3..<number)
    .filter { it % 3 == 0 || it % 5 == 0 }
    .sum()
