package step1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    String name = null;
    Customer customer = new Customer(name);

    @Test
    public void testForEmptyRentals(){


        assertEquals("Rental Record for null\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter pointers", customer.statement());

    }

    @Test
    public void testRegularMovieFor2Days(){

        int daysRented = 2;
        int priceCode = Movie.REGULAR;

        addRental(priceCode, daysRented);
        assertEquals("Rental Record for null\n" +
                "\t2.0(null)\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter pointers", customer.statement());

    }

    private void addRental(int priceCode, int daysRented) {
        String title = null;
        Movie movie = new Movie(title, priceCode);
        Rental rental = new Rental(movie, daysRented);
        customer.addRental(rental);
    }

    @Test
    public void testRegularMovieFor3Days() throws Exception{

        int daysRented = 3;
        int priceCode = Movie.REGULAR;

        addRental(priceCode, daysRented);
        assertEquals("Rental Record for null\n" +
                "\t3.5(null)\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter pointers", customer.statement());

    }
}