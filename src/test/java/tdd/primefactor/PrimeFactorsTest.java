package tdd.primefactor;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void primeFactorsOfPrimeNumbers() {
		assertEquals(Arrays.asList(2),PrimeFactors.of(2));
		assertEquals(Arrays.asList(3),PrimeFactors.of(3));
		
		assertArrayEquals(new boolean[] {false}, new boolean[] {false});
	}
	
	@Test
	public void primeFactorsOf4() {
		assertEquals(Arrays.asList(2,2),PrimeFactors.of(4));		
	}
	
	@Test
	public void primeFactorsOf8() {
		assertEquals(Arrays.asList(2,2,2),PrimeFactors.of(8));		
	}
	
	@Test
	public void primeFactorsOf6() {
		assertEquals(Arrays.asList(2,3),PrimeFactors.of(6));
	}
	
	@Test
	public void primeFactorsOf30() {
		assertEquals(Arrays.asList(2,3,5),PrimeFactors.of(30));
	}
	
	@Test
	public void primeFactorsOfBigNumber() {
		assertEquals(Arrays.asList(2,2,3,3,5,5,7,7,11,11),PrimeFactors.of(2*2*3*3*5*5*7*7*11*11));
	}
}
