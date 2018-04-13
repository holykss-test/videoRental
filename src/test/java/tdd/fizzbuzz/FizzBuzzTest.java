package tdd.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzbuzz_1_should_says_1() {
        assertEquals("1", FizzBuzz.says(1));
    }

    @Test
    public void fizzbuzz_2_should_says_2() {
        assertEquals("2", FizzBuzz.says(2));
    }

    @Test
    public void fizzbuzz_3_should_says_FizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.says(3));
    }
}
