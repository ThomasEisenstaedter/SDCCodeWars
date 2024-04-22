package codewars.kyu07

/*fun getCount(str: String): Int {
    var count = 0
    for (ch in str) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++
        }
    }
    return count
}*/

fun getCount(str: String): Int {
    return str.count { it in "aeiou" }
}