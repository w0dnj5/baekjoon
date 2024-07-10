package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum FizzBuzz {

    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZBUZZ("FizzBuzz");

    private final String display;

    FizzBuzz(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}

public class Baekjoon28702 {

    public static final int INPUT_LENGTH = 3;

    // 3의 배수 && 5의 배수 = "FizzBuzz"
    // 3의 배수 && !5의 배수 = "Fizz"
    // !3의 배수 && 5의 배수 = "Buzz"
    // !3배수 && !5의 배수 = i

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[INPUT_LENGTH];
        for(int i = 0; i < 3; i++) {
            inputs[i] = br.readLine();
        }

        String result = null;
        for(int i = 0; i < INPUT_LENGTH; i++) {
            if(isInteger(inputs[i])) {
                result = getResult(Integer.parseInt(inputs[i]) + (INPUT_LENGTH - i));
                break;
            }
        }

        System.out.println(result);
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static String getResult(int num) {
        if(num % 3 != 0 && num % 5 == 0) return FizzBuzz.BUZZ.getDisplay();
        if(num % 3 == 0 && num % 5 != 0) return FizzBuzz.FIZZ.getDisplay();
        if(num % 3 == 0 && num % 5 == 0) return FizzBuzz.FIZZBUZZ.getDisplay();
        return String.valueOf(num);
    }
}