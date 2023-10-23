package nl.freshminds

/**
 * In mathematics, the Fibonacci numbers, form a sequence, in which each number is the sum of the two preceding ones.
 * Starting from 0 and 1, the first 10 values in the sequence are:
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 *
 * Implement [fibonacci] to return a comma separated String of the first [n] fibonacci numbers.
 */
fun fibonacci(n: Int): String {
   if ( n <= 1) {
      return 0.toString()
   } else {
      val list = (0..1).toMutableList();
      while (list.size < n) {
         list.add(list[list.size -2] + list[list.size -1])
      }
      return list.joinToString(",")
   }
}
