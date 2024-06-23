package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1003 {

    static int Z;
    static int O;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            Z = 0;
            O = 0;

            fibonacci(Integer.parseInt(br.readLine()));
            System.out.println(Z + " " + O);
        }
    }

    static int fibonacci(int n) {
        if (n == 0) {
            Z++;
            return 0;
        } else if (n == 1) {
            O++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
