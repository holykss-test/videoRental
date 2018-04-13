package step1;

import static org.junit.Assert.*;

import org.jetbrains.annotations.NotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	private static final int TWO_DAYS = 2;
    private static final int THREE_DAYS = 3;
    
	String name = "NAME_NOT_IMPORTANT";
    Customer customer = new Customer(name);
	private ConsoleStatement consoleStatement = new ConsoleStatement();

    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void statementFor_noRental() {
        assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter pointers",consoleStatement.statement(customer));
    }

    @Test
    public void statementFor_RegularMovie_for_more_than_() {        
		customer.addRental(createRegularRentalFor(TWO_DAYS));

        assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" + 
        		"	2.0(null)\n" + 
        		"Amount owed is 2.0\n" + 
        		"You earned 1 frequent renter pointers",consoleStatement.statement(customer));
    }
    
    
    @Test
    public void statementFor_RegularMovie_for_more_than_2days() {
		customer.addRental(createRegularRentalFor(THREE_DAYS));

        assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" + 
        		"	3.5(null)\n" + 
        		"Amount owed is 3.5\n" + 
        		"You earned 1 frequent renter pointers",consoleStatement.statement(customer));
    }

    @Test
    public void statementFor_NewRelease_for_less_than_2_day() {
		Rental rental = createRental(Movie.NEW_RELEASE, 1);
		customer.addRental(rental);

        assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" + 
        		"	3.0(null)\n" + 
        		"Amount owed is 3.0\n" + 
        		"You earned 1 frequent renter pointers",consoleStatement.statement(customer));
    }
    
    @Test
    public void statementFor_NewRelease_for_more_than_one_day() {
		Rental rental = createRental(Movie.NEW_RELEASE, TWO_DAYS);
		customer.addRental(rental);

        assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" + 
        		"	6.0(null)\n" + 
        		"Amount owed is 6.0\n" + 
        		"You earned 2 frequent renter pointers",consoleStatement.statement(customer));
    }
    
    
    @Test
    public void statementFor_Childrens_for_less_than_four_dys() {
		Rental rental = createRental(Movie.CHILDRENS, THREE_DAYS);
		customer.addRental(rental);

        assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" + 
        		"	1.5(null)\n" + 
        		"Amount owed is 1.5\n" + 
        		"You earned 1 frequent renter pointers",consoleStatement.statement(customer));
    }
    
    
    @Test
    public void statementFor_Childens_for_more_than_3_days() {
		Rental rental = createRental(Movie.CHILDRENS, 4);
		customer.addRental(rental);

        assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" + 
        		"	3.0(null)\n" + 
        		"Amount owed is 3.0\n" + 
        		"You earned 1 frequent renter pointers",consoleStatement.statement(customer));
    }
    
    @Test
    public void statementFor_() {
		customer.addRental(createRental(Movie.REGULAR, 1));
		customer.addRental(createRental(Movie.REGULAR, 3));
		customer.addRental(createRental(Movie.NEW_RELEASE, 1));
		customer.addRental(createRental(Movie.NEW_RELEASE, 4));
		customer.addRental(createRental(Movie.CHILDRENS, 2));
		customer.addRental(createRental(Movie.CHILDRENS, 4));

        assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" + 
        		"	2.0(null)\n" + 
        		"	3.5(null)\n" + 
        		"	3.0(null)\n" + 
        		"	12.0(null)\n" + 
        		"	1.5(null)\n" + 
        		"	3.0(null)\n" + 
        		"Amount owed is 25.0\n" + 
        		"You earned 7 frequent renter pointers",consoleStatement.statement(customer));
    }

	private Rental createRegularRentalFor(int daysRented) {
		int priceCode = Movie.REGULAR;
		return createRental(priceCode, daysRented);
	}

	private Rental createRental(int priceCode, int daysRented) {
		String title = null;
		Movie movie = createMovie(title, priceCode);
		Rental rental = new Rental(movie, daysRented);
		return rental;
	}

	@NotNull
	private Movie createMovie(String title, int priceCode) {
		if (priceCode == Movie.REGULAR) {
			return new RegularMovie(title);
		}
		if (priceCode == Movie.NEW_RELEASE) {
			return new NewReleaseMovie(title);
		}
		return new Movie(title, priceCode);
	}

}
