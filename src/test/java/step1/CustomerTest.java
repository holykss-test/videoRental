package step1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {


    @Test
    public void test1() throws Exception{
        String name = null;
        Customer customer = new Customer(name);

        assertEquals("Rental Record for null\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter pointers", customer.statement());

    }

}