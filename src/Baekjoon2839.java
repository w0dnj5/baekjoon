package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int result = -1;
        for (int i = 0; i <= n / 5; i++) {
            int c = (n - (5 * i));
            if (c % 3 == 0) {
                if (result == -1) {
                    result = i + (c / 3);
                } else {
                    result = Math.min(result, i + (c / 3));
                }
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
