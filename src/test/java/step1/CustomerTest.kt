package step1

import org.junit.Test

import org.junit.Assert.*

class CustomerTest {
    private val name = "NAME_NOT_IMPORTANT"
    private val TWO_DAYS = 2
    private val THREE_DAYS = 3

    private val customer = Customer(name)


    @Test
    fun statementForNoRental() {

        assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter pointers", customer.statement())
    }

    /**
     * 중복을 제거하려면 추상화가 필요하다.
     * ㅇㅣ름을 짓는 순간 추상화를 하고 있는 것이다.
     */
    @Test
    fun statementForRegularMovieForMoreThan() {

        val rental = createRegularRentalFor(TWO_DAYS)
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

        val rental = createRegularRentalFor(THREE_DAYS)
        customer.addRental(rental)

        assertEquals(
                """Rental Record for NAME_NOT_IMPORTANT
	3.5()
Amount owed is 3.5
You earned 1 frequent renter pointers""",
                customer.statement())
    }

    private fun createRegularRentalFor(daysRented: Int): Rental {
        val title = ""
        val movie = Movie(title, Movie.REGULAR)
        val rental = Rental(movie, daysRented)
        return rental
    }


}