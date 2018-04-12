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

	int getFrequentRenterPoints() {
		// add frequent renter points
		int daysRented = getDaysRented();

		return movie.getFrequentRenterPoints(daysRented);
	}

	@NotNull
	String getStatementResult() {
		return "\t" +  String.valueOf(getPrice()) + "(" + movie.getTitle() + ")" + "\n";
	}
}