package nl.freshminds

/**
 * Refactor [isPrime] to an extension function.
 */
fun Int.isPrime(): Boolean {
    return (2 until this).none {this % it == 0}
}
