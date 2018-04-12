package step1;

import org.jetbrains.annotations.NotNull;

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

    public String statement(ConsoleStatement statement) {
        return getHeader() + getFigures() + getTail();
    }

    @NotNull
    private String getHeader() {
        return "Rental Record for " + getName() + "\n";
    }

    @NotNull
    private String getTail() {
        String result = "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter pointers";
        return result;
    }

    private double getTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.getPrice();
        }
        return totalAmount;
    }

    private String getFigures() {
        String result = "";
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