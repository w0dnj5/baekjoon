package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon1018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean white = true;

        boolean[][] board = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                if (input.charAt(j) == 'W') {
                    board[i][j] = white;
                }
            }
        }

        int min = 64;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int count = 0;
                boolean first = board[i][j];
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (board[k][l] != first) {
                            count++;
                        }
                        first = !first;
                    }
                    first = !first;
                }
                // 흑 시작, 백 시작 체스판을 비교해서 더 작은 값
                count = Math.min(count, 64 - count);
                // 최솟값을 반영
                min = Math.min(min, count);
            }
        }
        bw.write(min + "\n");
        bw.flush();
        bw.close();
    }
}
