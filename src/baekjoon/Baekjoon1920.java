package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] firstInts = new int[n];
        for (int i = 0; i < n; i++) {
            firstInts[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] secondInts = new int[m];
        for (int i = 0; i < m; i++) {
            secondInts[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(firstInts);

        for (int i = 0; i < m; i++) {
            int number = secondInts[i];
            int start = 0;
            int end = n - 1;
            boolean flag = false;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (number == firstInts[mid]) {
                    flag = true;
                    break;
                } else if (number < firstInts[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (flag) {
                bw.write(1 + "\n");
            } else {
                bw.write(0 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
