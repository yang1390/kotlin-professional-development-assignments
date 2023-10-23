package nl.freshminds

import kotlin.random.Random

/**
 * There are no tests available for this assignment.
 *
 * Implement a singleton [IdGenerator]. It should hava single method [next] which returns the next random ID as a
 * String. Next accepts a single argument of [prefix] which is added to the generated ID as a prefix. If no [prefix]
 * is specified, it defaults to an empty string.
 */

fun main() {
    println(IdGenerator.next("prefix"))
}
object IdGenerator {

    fun next(prefix: String = "") : String = prefix +  Random.nextInt(0, 100)

}
