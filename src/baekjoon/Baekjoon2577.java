package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon2577 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tmp = 1;
        for (int i = 0; i < 3; i++) {
            tmp *= Integer.parseInt(br.readLine());
        }
        String number = String.valueOf(tmp);

        int[] count = new int[10];

        for (int i = 0; i < number.length(); i++) {
            count[number.charAt(i) - '0']++;
        }

        for (int i : count) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
