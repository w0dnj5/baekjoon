import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon18111 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] ground = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int minTime = -1;
        int maxHeight = -1;
        for (int h = 0; h <= 256; h++) {
            int block = b;
            int time = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (h < ground[i][j]) {
                        time += (ground[i][j] - h) * 2;
                        block += ground[i][j] - h;
                    } else if (h > ground[i][j]) {
                        time += h - ground[i][j];
                        block -= h - ground[i][j];
                    }
                }
            }
            if (block >= 0) {
                if (minTime == -1) {
                    minTime = time;
                    maxHeight = h;
                } else {
                    if (minTime >= time) {
                        minTime = time;
                        maxHeight = h;
                    }
                }
            }
        }
        bw.write(String.format("%d %d", minTime, maxHeight));
        bw.flush();
        bw.close();
    }
}
