package codewars.kyu06.findthemissingletter

fun findMissingLetter(array: CharArray): Char {
    for (i in 0..array.size-1) {
        if (array[i] + 1 != array[i + 1]) {
            return array[i] + 1
        }
    }
    return ' ';
}