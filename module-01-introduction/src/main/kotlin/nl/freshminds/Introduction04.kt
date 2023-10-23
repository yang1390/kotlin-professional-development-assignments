package nl.freshminds

/**
 * 2520 is the smallest number that can be divided by each number from 1 to 10 without any remainder.
 *
 * Implement [divisibleByAllNumbersFrom1to20] to find the smallest number that is divisible by each number from
 * 1 to 20 without any remainder.
 */
fun divisibleByAllNumbersFrom1to20(): Int {
    val list = (1..20).toList();
    var i = 20
    while (i >= 0) {
        if(list.all {
            i % it == 0
        }) {
            return i;
        }
        i += 20
    }
    return 0
}
