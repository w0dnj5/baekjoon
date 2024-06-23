package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] opinions = new int[n];

        for (int i = 0; i < n; i++) {
            opinions[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(opinions);
        int c = (int) Math.round((double) n * 0.15);
        int sum = 0;
        for (int i = c; i < n - c; i++) {
            sum += opinions[i];
        }

        int average = (int) Math.round((double) sum / (n - (c * 2)));
        bw.write(String.valueOf(average));
        bw.flush();
        bw.close();
    }
}
