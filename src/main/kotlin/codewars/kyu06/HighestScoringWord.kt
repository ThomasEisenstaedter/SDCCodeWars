package codewars.kyu06

fun high(str: String) = str
    .split(" ")
    .maxBy { it.score() }

fun String.score(): Int = sumOf { it - 'a' + 1 }
