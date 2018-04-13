package tdd.prime

import junit.framework.Assert.assertEquals
import org.junit.Test

class PrimeFactorsTest {
    @Test
    fun primeFactorsOfPrimeNumbers() {
        assertEquals(listOf(2), PrimeFactors.of(2))
        assertEquals(listOf(3), PrimeFactors.of(3))
    }


    @Test
    fun primeFactorsOf4() {
        assertEquals(listOf(2, 2), PrimeFactors.of(4))
    }


}
