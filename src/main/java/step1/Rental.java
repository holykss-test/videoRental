package step1;

class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	double amountFor() {
		// determine amounts for each line

		final int daysRented = getDaysRented();
		return amountFor(daysRented);
	}

	double amountFor(int daysRented) {
		double thisAmount = 0;

		switch (movie.getPriceCode()) {
        case Movie.REGULAR:
            thisAmount += 2;
            if (daysRented > 2)
                thisAmount += (daysRented - 2) * 1.5;
            break;

        case Movie.NEW_RELEASE:
            thisAmount += daysRented * 3;
            break;

        case Movie.CHILDRENS:
            thisAmount += 1.5;
            if (daysRented > 3)
                thisAmount += (daysRented - 3) * 1.5;
            break;
        }
		return thisAmount;
	}

	private Movie getMovie() {
		return getMovie();
	}
}