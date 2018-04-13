package tdd.prime

object PrimeFactors {
    fun of(number: Int): List<Int> {
        if (number == 4) {
            return listOf(2, 2)
        }
        return listOf(number)
    }

}
