package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon28702 {

    public static final String FIZZBUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final int INPUT_LENGTH = 3;

    // 3의 배수 && 5의 배수 = "FizzBuzz"
    // 3의 배수 && !5의 배수 = "Fizz"
    // !3의 배수 && 5의 배수 = "Buzz"
    // !3배수 && !5의 배수 = number

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[INPUT_LENGTH];
        for(int i = 0; i < INPUT_LENGTH; i++) {
            inputs[i] = br.readLine();
        }

        String result = null;
        for(int i = 0; i < INPUT_LENGTH; i++) {
            if(isInteger(inputs[i])) {
                result = calculate(Integer.parseInt(inputs[i]) + (INPUT_LENGTH - i));
                break;
            }
        }

        System.out.println(result);
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String calculate(int num) {
        if(num % 3 != 0 && num % 5 == 0) return BUZZ;
        if(num % 3 == 0 && num % 5 != 0) return FIZZ;
        if(num % 3 == 0 && num % 5 == 0) return FIZZBUZZ;
        return String.valueOf(num);
    }
}