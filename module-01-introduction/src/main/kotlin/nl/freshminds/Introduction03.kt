package nl.freshminds

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
 * numbers is 9009 = 91 × 99.
 *
 * Implement [palindromicNumber] to find the largest palindrome made from the product of two 3-digit numbers.
 */
fun palindromicNumber(): Int {
    var highestNumber: Int = 0;
    for (i in 999 downTo 1) {
        for (j in 999 downTo  1) {
            val sum: Int = (i * j)
            val sumString = sum.toString()
            if(sumString == sumString.reversed() && sum > highestNumber) {
                highestNumber = sum
            }
        }
    }
    return highestNumber;
}
