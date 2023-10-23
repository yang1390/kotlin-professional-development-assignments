package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * 1. Create a [Person] class with a [fullName] property in the primary constructor.
 *
 * 2. Add a secondary constructor to the [Person] class which accepts a [firstName] and [lastName].
 *
 * 3. Hide the primary constructor by marking it as private.
 *
 * 4. Create a main function, construct a couple of [Person] objects via the secondary constructor and print their
 * [fullName].
 */

fun main() {
    listOf(Person("f", "l"),
        Person("f1", "l1"),
        Person("f2", "l2"),
        Person("f3", "l3")).forEach { person -> println(person.fullName) }
}

class Person private constructor(val fullName: String) {

    constructor(firstName: String, lastName: String) : this("$firstName $lastName")
}
