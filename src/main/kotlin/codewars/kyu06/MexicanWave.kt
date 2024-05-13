package codewars.kyu06

//fun wave(str: String) = str.indices
//    .map { index -> str.toWaveBasedOn(index) }
//    .filter { it.isNotEmpty() }
//
//fun String.toWaveBasedOn(index: Int): String {
//    return if (!this.checkIfEmpty(index)) {
//        val stringBuilder = StringBuilder()
//        stringBuilder
//            .append(this.substring(0, index))
//            .append(this.substring(index, index + 1).uppercase())
//            .append(this.substring(index + 1))
//            .toString()
//    } else {
//        ""
//    }
//}

//fun String.checkIfEmpty(index: Int) = this[index] == ' '

fun wave(str: String) = str
    .indices
    .filter { index -> str[index] != ' ' }
    .map { index -> str.toWaveBasedOn(index) }

fun String.toWaveBasedOn(index: Int): String {
    val stringBuilder = StringBuilder()
    return stringBuilder
        .append(this.substring(0, index).lowercase())
        .append(this.substring(index, index + 1).uppercase())
        .append(this.substring(index + 1).lowercase())
        .toString()
}
