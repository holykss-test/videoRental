package step1

import org.junit.Test

import org.junit.Assert.*

class CustomerTest {
    private val name = "NAME_NOT_IMPORTANT"
    private val customer = Customer(name)

    @Test
    fun testCreate() {

        assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter pointers", customer.statement())
    }

    @Test
    fun statementForRegularMovieForMoreThan() {

        val rental = Rental(Movie("", 0), 2)
        customer.addRental(rental)

        assertEquals(
                """Rental Record for NAME_NOT_IMPORTANT
	2.0()
Amount owed is 2.0
You earned 1 frequent renter pointers""",
                customer.statement())
    }

    /**
     * 여기까지 왔으면 테스트 이름을 정할 수 있다.
     */
    @Test
    fun statementForRegularMovieForMoreThan2Days() {

        val priceCode = 0
        val title = ""
        val movie = Movie(title, priceCode)

        val daysRented = 3
        val rental = Rental(movie, daysRented)
        customer.addRental(rental)

        assertEquals(
                """Rental Record for NAME_NOT_IMPORTANT
	3.5()
Amount owed is 3.5
You earned 1 frequent renter pointers""",
                customer.statement())
    }

}