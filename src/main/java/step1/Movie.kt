package step1

class Movie(val title: String, var priceCode: Int) {
    internal val DEFAULT_POINTS = 1

    internal fun amountFor(daysRented: Int): Double {
        var thisAmount = 0.0

        when (priceCode) {
            REGULAR -> {
                thisAmount += 2.0
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5
            }

            NEW_RELEASE -> thisAmount += (daysRented * 3).toDouble()

            CHILDRENS -> {
                thisAmount += 1.5
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5
            }
        }
        return thisAmount
    }

    internal fun getFrequentRenterPoints(daysRented: Int): Int {
        return DEFAULT_POINTS + getBonusPoints(daysRented)
    }

    private fun getBonusPoints(daysRented: Int): Int {
        return if (priceCode == NEW_RELEASE && daysRented > 1) 1 else 0
    }

    companion object {
        val CHILDRENS = 2
        val REGULAR = 0
        val NEW_RELEASE = 1
    }
}