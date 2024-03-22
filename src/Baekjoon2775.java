import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[][] apartment = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apartment[0][i] = i;
            apartment[i][0] = 0;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                apartment[i][j] = apartment[i - 1][j] + apartment[i][j - 1];
            }
        }

        for (int i = 0; i < t; i++) {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            bw.write(apartment[x][y] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
