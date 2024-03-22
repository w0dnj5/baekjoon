package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon26169 {
    static int N = 5;
    static int[][] BOARD;
    static boolean[][] VISIT;
    static int[] MOVE_X = {0, 0, 1, -1};
    static int[] MOVE_Y = {1, -1, 0, 0};
    static int RESULT;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BOARD = new int[N][N];
        VISIT = new boolean[N][N];
        // 입력 받은 값으로 맵 생성
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                BOARD[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        RESULT = 0;
        dfs(x, y, 0, 0);
        System.out.println(RESULT);
    }

    public static void dfs(int x, int y, int apple, int count) {
        // 만약 보드에 사과가 있다면 사과를 줍는다
        if (BOARD[x][y] == 1) {
            apple++;
        }
        // 3칸 이동했다면 탐색을 종료
        if (count == 3) {
            // 사과를 2개 이상 얻었다면 1를 반환
            if (apple >= 2) {
                RESULT = 1;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int xx = x + MOVE_X[i];
            int yy = y + MOVE_Y[i];
            // 다음 이동 칸이 보드 내의 값이고 장애물이 없고 방문한 적이 없는 칸이면 탐색을 시작
            if (xx >= 0 && xx < N && yy >= 0 && yy < N && BOARD[xx][yy] != -1 && !VISIT[xx][yy]) {
                // 이동 시 장애물 생성
                VISIT[x][y] = true;
                dfs(xx, yy, apple, count + 1);
                // 다른 경우의 수를 위해 깊은 탐색 후 장애물 제거
                VISIT[x][y] = false;
            }
        }
    }
}
