package codewars.kyu07

//INPUT:
//Simple, given a string of words, return the length of the shortest word(s).
//
//String will never be empty and you do not need to account for different data types.
//
//
//fun findShort(s: String): Int {
//
//}
fun findShort(s: String) = s.split(" ").map { it.length }.minOf { it }