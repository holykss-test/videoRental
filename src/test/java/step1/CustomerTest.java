package step1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {


    @Test
    public void test1() throws Exception{
        String name = null;
        Customer customer = new Customer(name);

        assertEquals(null, customer.statement());

    }

}