package nl.freshminds

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Oop06Test {

    @Test
    fun `isPrime extension function`() {
        // TODO uncomment these assertions after implementing the extension function
         assertTrue(2.isPrime())
         assertTrue(7.isPrime())
         assertTrue(11.isPrime())
         assertTrue(13.isPrime())
         assertFalse(10.isPrime())
         assertFalse(40.isPrime())
    }
}
