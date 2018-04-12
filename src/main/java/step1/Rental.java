package step1;

import org.jetbrains.annotations.NotNull;

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

	double getPrice() {
		// determine amounts for each line

		final int daysRented = getDaysRented();
		return movie.amountFor(daysRented);
	}

	public Movie getMovie() {
		return movie;
	}

	int getFrequentRenterPoints() {
		// add frequent renter points
		int frequentRenterPoints = 1;

		// add bonus for a two day new release rental
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
            frequentRenterPoints++;
		return frequentRenterPoints;
	}

	@NotNull
	String getStatementResult() {
		return "\t" +  String.valueOf(getPrice()) + "(" + getMovie().getTitle() + ")" + "\n";
	}
}