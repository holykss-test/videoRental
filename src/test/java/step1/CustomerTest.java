package step1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {


    @Test
    public void testForEmptyRentals() throws Exception{
        String name = null;
        Customer customer = new Customer(name);

        assertEquals("Rental Record for null\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter pointers", customer.statement());

    }

    @Test
    public void testRegularMovieFor2Days() throws Exception{
        String name = null;
        Customer customer = new Customer(name);

        int priceCode = Movie.REGULAR;
        String title = null;
        Movie movie = new Movie(title, priceCode);
        int daysRented = 2;
        Rental rental = new Rental(movie, daysRented);
        customer.addRental(rental);
        assertEquals("Rental Record for null\n" +
                "\t2.0(null)\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter pointers", customer.statement());

    }

    @Test
    public void testRegularMovieFor3Days() throws Exception{
        String name = null;
        Customer customer = new Customer(name);

        int priceCode = Movie.REGULAR;
        String title = null;
        Movie movie = new Movie(title, priceCode);
        int daysRented = 3;
        Rental rental = new Rental(movie, daysRented);
        customer.addRental(rental);
        assertEquals("Rental Record for null\n" +
                "\t3.5(null)\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter pointers", customer.statement());

    }
}