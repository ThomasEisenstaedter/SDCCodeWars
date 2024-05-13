package codewars.kyu06.findthemissingletter

fun findMissingLetter(array: CharArray): Char {
    for (i in 0..array.size - 1) {
        if (array[i] + 1 != array[i + 1]) {
            return array[i] + 1
        }
    }
    return ' ';
}

fun findMissingLetter2(array: CharArray) = (array.first()..array.last())
    .first { it !in array }


//Variante Daniel Knuth mit EXTENSIONMETHOD
fun findMissingLetter3(array: CharArray) = fullRangeOf(array).first{!array.contains(it)}

private fun fullRangeOf(array: CharArray) = (array.first() ..array.last())


