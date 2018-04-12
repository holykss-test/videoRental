package step1

class Rental(private val movie: Movie, val daysRented: Int) {

    // determine amounts for each line
    val price: Double
        get() {

            val daysRented = daysRented
            return movie.amountFor(daysRented)
        }

    // add frequent renter points
    val frequentRenterPoints: Int
        get() {
            val daysRented = daysRented

            return movie.getFrequentRenterPoints(daysRented)
        }

    val statementResult: String
        get() = "\t" + price.toString() + "(" + movie.title + ")" + "\n"
}