package tdd.primefactor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> of(int number) {
		List<Integer> primeFactors = new ArrayList<>();

		for (int divisor = 2; number != 1; divisor++) {
			while (number % divisor == 0) {
				primeFactors.add(divisor);
				number /= divisor;
			}
		}
		return primeFactors;
	}

}
