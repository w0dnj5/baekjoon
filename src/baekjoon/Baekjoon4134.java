package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon4134 {

    public static boolean prime(long number) {
        if(number == 0 || number == 1) {
            return false;
        }
        for(long i = 2; i * i <= number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfCases = Integer.parseInt(br.readLine());

        long[] lines = new long[numberOfCases];
        for(int i = 0; i < numberOfCases ; i++) {
            lines[i] = Long.parseLong(br.readLine());
        }

        for(int i = 0; i < numberOfCases ; i++) {
            long number = lines[i];
            while(!prime(number)) {
                number++;
            }
            bw.write(String.valueOf(number));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
