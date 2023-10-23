package nl.freshminds

/**
 * Implement the [fizzBuzz] function so that the tests in 'Assignment02Test.kt' pass.
 *
 * Requirements:
 * - Return "Fizz" if [input] is a multiple of 3.
 * - Return "Buzz" if [input] is a multiple of 5.
 * - Return "FizzBuzz" if [input] is a multiple of both 3 and 5.
 * - Return the value of [input] as a String when it's not a multiple of 3 or 5.
 */
fun fizzBuzz(input: Int): String {
    return when {
        input % 3 == 0 && input % 5 == 0 -> return "FizzBuzz"
        input % 3 == 0 -> return "Fizz"
        input % 5 == 0 -> return "Buzz"
        else -> input.toString()
    }
}

/**
 * Implement the function below to print [n] FizzBuzz numbers to the console (starting from 1).
 *
 * Example input: n = 5
 * Example output: 1, 2, FIZZ, 4, BUZZ
 */
fun printFizzBuzzNumbers(n: Int) {
    for (i in 1..n) {
        println(fizzBuzz(i))
    }
}
