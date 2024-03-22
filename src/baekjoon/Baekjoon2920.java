package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon2920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int l = 8;
        int[] arr = new int[l];
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }
        String status;
        if (arr[0] == 1) {
            status = "ascending";
        } else if (arr[0] == 8) {
            status = "descending";
        } else {
            status = "mixed";
        }

        if (status.equals("ascending")) {
            for (int j = 0; j < l - 1; j++) {
                if (arr[j] + 1 != arr[j + 1]) {
                    status = "mixed";
                    break;
                }
            }
        } else if (status.equals("descending")) {
            for (int j = 0; j < l - 1; j++) {
                if (arr[j] - 1 != arr[j + 1]) {
                    status = "mixed";
                    break;
                }
            }
        }
        bw.write(status);
        bw.flush();
        bw.close();
    }
}
