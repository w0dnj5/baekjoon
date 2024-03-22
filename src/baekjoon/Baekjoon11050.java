package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon11050 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int x = 1;
        int y = 1;
        int z = 1;

        for (int i = 1; i <= n; i++) {
            x *= i;
        }

        for (int i = 1; i <= n - k; i++) {
            y *= i;
        }

        for (int i = 1; i <= k; i++) {
            z *= i;
        }

        bw.write(x / (y * z) + "\n");
        bw.flush();
        bw.close();
    }
}
