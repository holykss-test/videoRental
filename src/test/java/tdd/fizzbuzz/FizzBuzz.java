package tdd.fizzbuzz;

public class FizzBuzz {
    public static String says(int number) {

        if (number == 2)
            return "" + number;
        if (number == 1)
            return "" + number;

        throw new RuntimeException("허용되지 않은 입력 값");
    }
}
