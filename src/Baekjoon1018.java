import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int column = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        String[][] board = new String[column][];

        for(int i=0;i<column;i++) {
            board[i] = br.readLine().split("");
        }
    }
}
