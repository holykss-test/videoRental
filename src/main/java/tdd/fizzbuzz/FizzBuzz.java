package tdd.fizzbuzz;

public class FizzBuzz {

	public static String say(int number) {
		if ( number % 15 == 0 )
			return "FizzBuzz";
		if ( number % 5 == 0 )
			return "Buzz";
		if (number % 3 == 0)
			return "Fizz";
		return String.valueOf(number);
	}

	public static String say2(int number) {
		String result = "";
		
		if (number % 3 == 0)
			result += "Fizz";
		if ( number % 5 == 0 )
			result += "Buzz";
		
		if ( result.isEmpty() )
			return String.valueOf(number);
		return result;
	}
}
