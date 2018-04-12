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
		return movie.amountFor(daysRented);
	}

	public Movie getMovie() {
		return movie;
	}
}