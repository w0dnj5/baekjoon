package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon1259 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }

            String result = "yes";
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    result = "no";
                    break;
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}