package ch.hearc.ig;

import java.util.HashSet;
import java.util.Set;

public class FizzBuzz {
    public static String generate(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        if (number % 5 == 0 && number % 7 == 0) {
            return "FizzBuzz";
        }
        if (String.valueOf(number).contains("66")){
            return "FizzBuzz";
        }
        if (number % 5 == 0) {
            return "Fizz";
        }
        if (number % 7 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static String generateMultiple(int number1, int number2) {
        int j = number1;
        int number;
        if (number1 < 0 || number2 < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        String[] result = new String[number2];
        for (int i = 0; i < number2; i++) {
            number = j + i;
            result[i]=(generate(number));
        }
        return String.join(", ", result);
    }
}
