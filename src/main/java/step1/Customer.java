package step1;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    ;

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    ;

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";

        int frequentRenterPoints = getFrequentRenterPoints();

        result = getFigures(result);

        double totalAmount = getTotalAmount();

        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter pointers";

        return result;
    }

    private double getTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.getPrice();
        }
        return totalAmount;
    }

    private String getFigures(String result) {
        for (Rental rental : rentals) {
            result += rental.getStatementResult();
        }
        return result;
    }

    private int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

}