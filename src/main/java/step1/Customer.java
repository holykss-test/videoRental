package step1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

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

	double getTotalAmount() {
		double totalAmount = 0;		
		for ( Rental rental : rentals ) {
			totalAmount += rental.getPrice();
		}
		return totalAmount;
	}

	int getFrequentRenterPoints() {
		int frequentRenterPoints = 0;
		for ( Rental rental : rentals ) {
			frequentRenterPoints += rental.getFrequentRenterPoints();
		}
		return frequentRenterPoints;
	}

	public Iterable<Rental> getRentals() {
		return rentals;
	}
}