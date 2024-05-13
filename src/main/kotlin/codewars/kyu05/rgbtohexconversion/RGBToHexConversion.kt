package codewars.kyu05.rgbtohexconversion

/*INPUT:
The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal
representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range
must be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
Examples (input --> output):

255, 255, 255 --> "FFFFFF"
255, 255, 300 --> "FFFFFF"
0, 0, 0       --> "000000"
148, 0, 211   --> "9400D3"*/

@OptIn(ExperimentalStdlibApi::class)
fun rgb(r: Int, g: Int, b: Int): String {
    val stringBuilder = StringBuilder()

    return stringBuilder
        .append(ensureIsInRange(r).toHexString().uppercase().takeLast(2))
        .append(ensureIsInRange(g).toHexString().uppercase().takeLast(2))
        .append(ensureIsInRange(b).toHexString().uppercase().takeLast(2))
        .toString()
}

fun rgb2(r: Int, g: Int, b: Int): String {
    val stringBuilder = StringBuilder()

    return stringBuilder
        .append(convertToHex(ensureIsInRange(r)))
        .append(convertToHex(ensureIsInRange(g)))
        .append(convertToHex(ensureIsInRange(b)))
        .toString()
}

private fun ensureIsInRange(input: Int) = when {
    input < 0 -> 0
    input > 255 -> 255
    else -> input
}

private fun convertToHex(input: Int) = Integer.toHexString(input)
    .padStart(1, '0')
    .uppercase()
    .takeLast(2)

//Daniel Knuth
fun rgb5(r: Int, g: Int, b: Int) = "${r.toHex()}${g.toHex()}${b.toHex()}"


@OptIn(ExperimentalStdlibApi::class)
private fun Int.toHex() = this
    .coerceIn(0..255)
    .toByte()
    .toHexString(RgbHexFormat)

@OptIn(ExperimentalStdlibApi::class)
val RgbHexFormat = HexFormat {
    upperCase = true
    bytes {
        bytesPerLine = 1
    }
}

//Daniel Frank
fun rgb6(r: Int, g: Int, b: Int) = "${r.tolHexColor()}${g.tolHexColor()}${b.tolHexColor()}"

@OptIn(ExperimentalStdlibApi::class)
fun Int.tolHexColor() = this
    .coerceIn(0, 255)
    .toHexString(HexFormat.UpperCase)
    .takeLast(2)