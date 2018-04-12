package step1;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	};

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	};

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";

		for (Rental rental:rentals) {
			frequentRenterPoints += getFrequentRenterPoints(rental);

			// show figures
			result += getStatementResult(rental);

			totalAmount += rental.getPrice();
		}

		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter pointers";

		return result;
	}

	@NotNull
	private String getStatementResult(Rental rental) {
		return "\t" +  String.valueOf(rental.getPrice()) + "(" + rental.getMovie().getTitle() + ")" + "\n";
	}

	private int getFrequentRenterPoints(Rental rental) {
		// add frequent renter points
		int frequentRenterPoints = 0;
		frequentRenterPoints++;
		// add bonus for a two day new release rental
		if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
            frequentRenterPoints++;
		return frequentRenterPoints;
	}

}