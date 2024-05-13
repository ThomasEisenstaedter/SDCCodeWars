package codewars.kyu07

//INPUT:
//Count how often sign changes in array.
//
//result
//number from 0 to ... . Empty array returns 0
//
//example
//const arr = [1, -3, -4, 0, 5];
//
///*
//| elem | count |
//|------|-------|
//|  1   |  0    |
//| -3   |  1    |
//| -4   |  1    |
//|  0   |  2    |
//|  5   |  2    |
//*/
//
//catchSignChange(arr) == 2;
//
//
//fun catchSignChange(arr: Array<Int>): Int = 0

fun catchSignChange(arr: Array<Int>): Int {
//    return arr.indices
//        .count { index ->
           return arr.checkIndex()
        }


fun Array<Int>.checkIndex(): Int {
    var postive = true
    var count = 0
    for ( i in this.indices) {
        if ((this[i] > 0) != postive) {
            count++
            postive == false
        } else {
            postive == true
        }
    }
    return count
}

