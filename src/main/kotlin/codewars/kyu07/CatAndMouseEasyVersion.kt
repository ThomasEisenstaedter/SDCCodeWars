package codewars.kyu07

//INPUT:
//You will be given a string (x) featuring a cat 'C' and a mouse 'm'.
//The rest of the string will be made up of '.'.
//
//You need to find out if the cat can catch the mouse from it's current position.
//The cat can jump over three characters. So:
//
//C.....m returns 'Escaped!' <-- more than three characters between
//
//C...m returns 'Caught!' <-- as there are three characters between the two, the cat can jump.
//
//fun catMouse(s: String): String {
//    //Your code goes here!
//}

//fun catMouse2(s: String) = s.indices.count { it.toChar() == '.' }
//}

fun catMouse(s: String) = if (s.count { it == '.' } > 3) {
    "Escaped!"
} else {
    "Caught!"
}