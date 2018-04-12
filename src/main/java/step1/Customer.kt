package step1

import java.util.ArrayList

class Customer(val name: String) {
    private val rentals = ArrayList<Rental>()

    val header: String
        get() = "Rental Record for $name\n"

    val tail: String
        get() {
            var result = "Amount owed is " + totalAmount.toString() + "\n"
            result += "You earned " + frequentRenterPoints.toString() + " frequent renter pointers"
            return result
        }

    private val totalAmount: Double
        get() {
            var totalAmount = 0.0
            for (rental in rentals) {
                totalAmount += rental.price
            }
            return totalAmount
        }

    val figures: String
        get() {
            var result = ""
            for (rental in rentals) {
                result += rental.statementResult
            }
            return result
        }

    private val frequentRenterPoints: Int
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