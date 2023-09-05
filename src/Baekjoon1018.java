import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1018 {

    public static boolean[][] board;
    public static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        board = new boolean[n][m];
        String s;

        for(int i=0;i<n;i++) {
            s = br.readLine();
            for(int j=0;j<m;j++) {
                if(s.charAt(j) == 'W') {
                    board[i][j] = true;
                }
            }
        }

        for(int i=0;i<n-7;i++) {
            for(int j=0;j<m-7;j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y) {
        int cnt = 0;
        boolean tf = board[x][y];

        for(int i=x;i<8+x;i++) {
            for(int j=y;j<8+y;j++) {
                if(tf!=board[i][j]) {
                    cnt++;
                }
                tf = !tf;
            }
            tf = !tf;
        }

        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(min, cnt);
    }
}
