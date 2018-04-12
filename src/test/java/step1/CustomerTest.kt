package step1

import org.junit.Test

import org.junit.Assert.*

class CustomerTest {

    @Test
    fun 익명테스트1() {
        val name = null
        val customer = Customer(name)

        val statement = customer.statement()
        assertEquals("Rental Record for null\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter pointers", statement)
    }

    @Test
    fun 익명테스트2() {
        val name = null
        val customer = Customer(name)

        val rental = Rental(Movie("", 0), 0)
        customer.addRental(rental)

        val statement = customer.statement()
        assertEquals(
                """Rental Record for null
	2.0()
Amount owed is 2.0
You earned 1 frequent renter pointers""",
                statement)
    }
}