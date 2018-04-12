package step1

import java.util.ArrayList

class Customer(val name: String) {
    val rentals = ArrayList<Rental>()

    val totalAmount: Double
        get() {
            var totalAmount = 0.0
            for (rental in rentals) {
                totalAmount += rental.price
            }
            return totalAmount
        }

    val frequentRenterPoints: Int
        get() {
            var frequentRenterPoints = 0
            for (rental in rentals) {
                frequentRenterPoints += rental.frequentRenterPoints
            }
            return frequentRenterPoints
        }

    fun addRental(rental: Rental) {
        rentals.add(rental)
    }

    fun statement(statement: ConsoleStatement): String {

        return statement.getStatement(this)
    }
}