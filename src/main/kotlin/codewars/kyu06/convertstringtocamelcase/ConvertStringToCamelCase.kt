package codewars.kyu06.convertstringtocamelcase

fun toCamelCase2(str: String): String {
    if (str.isEmpty()) return ""
    val builder = StringBuilder()

    for (i in str.indices) {
        if (str[i] == '-' || str[i] == '_') {
            continue
        }

        if (i > 0 && (str[i - 1] == '-' || str[i - 1] == '_')) {
            builder.append(str[i].uppercase())
        } else {
            builder.append(str[i])
        }
    }
    return builder.toString()
}

//Jan Bäumler
fun toCamelCase3(str:String):String {
    return str
        .split("-", "_")
        .mapIndexed {index, value ->
            if(index == 0) {value}
            else value.replaceFirstChar { it.uppercase() } }
        .joinToString ("")
}

fun toCamelCase(str: String): String = str
    .split("-", "_")
    .joinToString("") { e -> e.replaceFirstChar { it.uppercase() } }
    .replaceFirstChar { str.first() }
