package step1

import org.junit.Test

import org.junit.Assert.*

class CustomerTest {
    private val name = "NAME_NOT_IMPORTANT"
    private val ONE_DAY = 1
    private val TWO_DAYS = 2
    private val THREE_DAYS = 3
    private val FOUR_DAYS = 4

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
        val priceCode = Movie.REGULAR
        return createRentalFor(priceCode, daysRented)
    }

    private fun createRentalFor(priceCode: Int, daysRented: Int): Rental {
        val movie = Movie("", priceCode)
        val rental = Rental(movie, daysRented)
        return rental
    }

    @Test
    fun statementForNewRelease() {

        val rental = createRentalFor(Movie.NEW_RELEASE, THREE_DAYS)
        customer.addRental(rental)

        assertEquals(
                """Rental Record for NAME_NOT_IMPORTANT
	9.0()
Amount owed is 9.0
You earned 2 frequent renter pointers""",
                customer.statement())
    }

    @Test
    fun statementForChildrenForThreeDays() {

        val rental = createRentalFor(Movie.CHILDRENS, THREE_DAYS)
        customer.addRental(rental)

        assertEquals(
                """Rental Record for NAME_NOT_IMPORTANT
	1.5()
Amount owed is 1.5
You earned 1 frequent renter pointers""",
                customer.statement())
    }

    @Test
    fun statementForChildrenForFourDays() {

        val rental = createRentalFor(Movie.CHILDRENS, FOUR_DAYS)
        customer.addRental(rental)

        assertEquals(
                """Rental Record for NAME_NOT_IMPORTANT
	3.0()
Amount owed is 3.0
You earned 1 frequent renter pointers""",
                customer.statement())
    }

    @Test
    fun statementForChildrenForLessThan2Days() {

        val rental = createRentalFor(Movie.CHILDRENS, ONE_DAY)
        customer.addRental(rental)

        assertEquals(
                """Rental Record for NAME_NOT_IMPORTANT
	1.5()
Amount owed is 1.5
You earned 1 frequent renter pointers""",
                customer.statement())
    }

    @Test
    fun statementForLoop() {

        customer.addRental(createRentalFor(Movie.REGULAR, 2))
        customer.addRental(createRentalFor(Movie.REGULAR, 3))

        customer.addRental(createRentalFor(Movie.CHILDRENS, 3))
        customer.addRental(createRentalFor(Movie.CHILDRENS, 4))

        customer.addRental(createRentalFor(Movie.NEW_RELEASE, 1))
        customer.addRental(createRentalFor(Movie.NEW_RELEASE, 4))

        assertEquals(
                """Rental Record for NAME_NOT_IMPORTANT
	2.0()
	3.5()
	1.5()
	3.0()
	3.0()
	12.0()
Amount owed is 25.0
You earned 7 frequent renter pointers""",
                customer.statement())
    }

}