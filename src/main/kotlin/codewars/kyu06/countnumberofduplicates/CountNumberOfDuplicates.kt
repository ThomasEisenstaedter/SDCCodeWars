package codewars.kyu06.countnumberofduplicates

import java.util.*

fun duplicateCount1(text: String): Int {
    val textSet = text
        .lowercase()
        .toSet()
    val resultMap = mutableMapOf<Char, Int>()

    for (ch in textSet) {
        for (ch2 in text) {
            if (ch == ch2) {
                resultMap[ch] = resultMap.getOrDefault(ch, 0) + 1
            }
        }
    }
    return resultMap.values
        .count { it > 1 }
}

fun duplicateCount(text: String): Int {
    return text
        .lowercase()
        .groupBy { it }
        .count { it.value.size > 1 }
}


//Variante Daniel Knuth mit EXTENSIONMETHOD
//AssociateWith bietet die Möglichkeit, hier mit dem Value zu spielen.
fun duplicateCount3(text: String) = text
    .uppercase()
    .associateWith { text.countCharsIgnoreCase(it) }
    .count { it.value > 1 }


private fun String.countCharsIgnoreCase(char: Char) = this
    .uppercase()
    .count { it == char.uppercaseChar() }




